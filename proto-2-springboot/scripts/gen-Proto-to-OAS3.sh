export GNOSTIC=/home/soumen/java_lab/proto/protobuf-tutorial/gnostic
INPUT=${1:-message.proto}
protoc -I. \
       -I$GNOSTIC \
       -I$GNOSTIC/third_party  \
       -I$GNOSTIC/cmd/protoc-gen-openapi/examples \
       --proto_path=. ${INPUT} \
       --openapi_out=. \
       --openapi_opt=paths=source_relative
OUTPUT=$(echo $INPUT|sed 's/proto/yaml/g')
mv openapi.yaml $OUTPUT

