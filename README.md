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
|4|Updated genProto.sh|```bash|||
|||SRC_DIR=proto|||
|||DST_DIR=users-java|||
|||SWAGGER=openapi|||
|||rm -fr $DST_DIR|||
|||rm -fr $SWAGGER|||
|||mkdir -p $DST_DIR|||
|||mkdir -p $SWAGGER|||
||||||
|||protoc -I=$SRC_DIR \|||
|||    --java_out=$DST_DIR \|||
|||    --openapi_out=$SWAGGER \|||
|||    $SRC_DIR/users.proto|||
|||```|||
||||||
