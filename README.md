## This is for documenting my journey to deep dive to learn protobuf
### Date: 01/24/2025 
1. Started watching few YouTube videos. Few medium pages, github repo:
  - https://www.youtube.com/watch?v=bT3gzNnOJPc
  - https://protobuf.dev/programming-guides/proto3/
  - https://stackoverflow.com/questions/60404663/how-to-generate-openapi-3-documentation-from-protobuf-files
  - https://github.com/google/gnostic/tree/main/cmd/protoc-gen-openapi
  - https://www.baeldung.com/spring-rest-api-with-protocol-buffers
  - https://medium.com/@amsokol.com/tutorial-how-to-develop-go-grpc-microservice-with-http-rest-endpoint-middleware-kubernetes-daebb36a97e9
2. Command History:

```bash
git clone https://github.com/sadnemous/protobuf-tutorial.git
mkdir proto
touch proto/users.proto
# add codes please see below.. 
git branch
git checkout feat-1
git checkout -b feat-1
git add tutorial.proto 
touch genProto.sh
chmod 755 genProto.sh
cat>genProto.sh 

./genProto.sh

cd com/example/tutorial/protos/
```

my users.proto is like:
```proto
syntax = "proto3";

package tutorial;

option java_multiple_files = true;
option java_package = "com.example.tutorial.protos";
option java_outer_classname = "UsersProtos";

message Request {
  int32 id = 1;
}

message Response {
  string fname = 1;
  string lname = 2;
  int32 id = 3;
  optional string email = 4;
}

service AddService {
  rpc GetUser(Request) returns (Response);
}
```

after running the genProto.sh this is the outcome:
```bash
soumen@UB:~/java_lab/proto/protobuf-tutorial$ ll
total 16
-rw-rw-r-- 1 soumen soumen 1011 Jan 24 02:08 README.md
drwxrwxr-x 2 soumen soumen 4096 Jan 24 02:10 proto
-rwxr-xr-x 1 soumen soumen   93 Jan 24 02:11 genProto.sh
drwxrwxr-x 3 soumen soumen 4096 Jan 24 02:11 users-java
soumen@UB:~/java_lab/proto/protobuf-tutorial$ cd users-java/
soumen@UB:~/java_lab/proto/protobuf-tutorial/users-java$ find .
.
./com
./com/example
./com/example/tutorial
./com/example/tutorial/protos
./com/example/tutorial/protos/UsersProtos.java
./com/example/tutorial/protos/ResponseOrBuilder.java
./com/example/tutorial/protos/RequestOrBuilder.java
./com/example/tutorial/protos/Request.java
./com/example/tutorial/protos/Response.java
```


### Date: 01/25/2025 
Did loads of thing. let me try to put it in tabular format
|sl.|Step|Desc|Failure|Solution|
|---|---|---|---|---|
|1|[Started From Here](https://stackoverflow.com/questions/60404663/how-to-generate-openapi-3-documentation-from-protobuf-files)|Studied and prepare fro cloning|-|
|2|Cloned [gnostic](https://github.com/google/gnostic)|cd cmd/protoc-gen-openapi;go build|-||
|3|which protoc-gen-openapi|Correctly installed|||
|4|Updated genProto.sh and ran the script|<pre>SRC_DIR=proto <br> DST_DIR=users-java <br> SWAGGER=openapi <br> rm -fr $DST_DIR <br> rm -fr $SWAGGER <br> mkdir -p $DST_DIR <br> mkdir -p $SWAGGER <br>  <br> protoc -I=$SRC_DIR \ <br>     --java_out=$DST_DIR \ <br>     --openapi_out=$SWAGGER \ <br>     $SRC_DIR/users.proto <br> </pre>|Yes, <pre>protoc-gen-openapi: unable to determine Go import path for "users.proto" <br>  <br> Please specify either: <br> 	• a "go_package" option in the .proto source file, or <br> 	• a "M" argument on the command line. <br>  <br> See https://protobuf.dev/reference/go/go-generated#package for more information. <br>  <br> </pre>||
|5|Updated proto/user.proto|<pre>syntax = "proto2"; <br>  <br> package tutorial; <br> option go_package = "com.example.tutorial.protos"; <br> option java_multiple_files = true; <br> option java_package = "com.example.tutorial.protos"; <br> option java_outer_classname = "UsersProtos"; <br>  <br> message Request { <br>   required int32 id = 1; <br> } <br>  <br> message Response { <br>   required string fname = 1; <br>   required string lname = 2; <br>   required int32 id = 3; <br>   optional string email = 4; <br> } <br>  <br> service AddService { <br>   rpc GetUser(Request) returns (Response); <br> } <br> </pre>|Failed as it created almost blank fiel||
|6|Cloned another repo from github [solo-io/protoc-gen-openapi](https://github.com/solo-io/protoc-gen-openapi)<br><pre> git clone https://github.com/solo-io/protoc-gen-openapi.git <br> cd protoc-gen-openapi <br> make build<br> cp ./_output/.bin/protoc-gen-openapi ~/go/bin/
<br> cd protobuf-tutorial/ <br> ./genProto.sh</pre>|Failed, <br> First  and there was a hiccup check note-6 below <br> then this version of proto-gen-openapi does not support proto-3.. <br> Ben Stokes!!| updated proto file
|7|Updated proto file and changed the version to 3|ran and failed| yes faile <br> <pre>soumen@UB:~/golang/work-2/protobuf-tutorial$ ./genProto.sh  <br> users.proto:10:3: Expected "required", "optional", or "repeated". <br> users.proto:14:3: Expected "required", "optional", or "repeated". <br> users.proto:15:3: Expected "required", "optional", or "repeated". <br> users.proto:16:3: Expected "required", "optional", or "repeated". <br>  <br> </pre>|BEN STOKES!!
|8|Updated proto file added required to mandatory fields<br>ran the script|Sweeeet!! Got the output which is promising!!|||

###
Note-6: when I tried to build solo-io it failed
```bash
mkdir -p /home/soumen/golang/protoc-gen-openapi/_output/.bin
GOBIN=/home/soumen/golang/protoc-gen-openapi/_output/.bin go install github.com/golang/protobuf/protoc-gen-go
go: downloading go1.22 (linux/amd64)
go: download go1.22 for linux/amd64: toolchain not available
make: *** [Makefile:13: install-deps] Error 1
```
<br> Solution: found here [Toolchain-not-available-error-prevents-me-from-using-any-go-commands](https://stackoverflow.com/questions/78519711/toolchain-not-available-error-prevents-me-from-using-any-go-commands)

<br> Fixed it by editing the go.mod file.
<br> changed go 1.22 to go 1.22.0
#### I will update the repo and push the changes
