## This is for documenting my journey to deep dive to learn protobuf
### Date: 01/24/2025 
1. Started watching few YouTube videos. Few medium pages, github repo:
  - https://www.youtube.com/watch?v=bT3gzNnOJPc
  - https://protobuf.dev/programming-guides/proto3/
  - https://stackoverflow.com/questions/60404663/how-to-generate-openapi-3-documentation-from-protobuf-files
  - https://github.com/google/gnostic/tree/main/cmd/protoc-gen-openapi
  - https://www.baeldung.com/spring-rest-api-with-protocol-buffers
  - https://medium.com/@amsokol.com/tutorial-how-to-develop-go-grpc-microservice-with-http-rest-endpoint-middleware-kubernetes-daebb36a97e9
2. 

  694  git clone https://github.com/sadnemous/protobuf-tutorial.git
  695  ll
  696  cd protobuf-tutorial/
  697  cp ../tutorial.proto  .
  698  ll
  699  git branch
  700  git checkout feat-1
  701  git checkout -b feat-1
  702  git add tutorial.proto 
  703  ll
  704  touch genProto.sh
  705  chmod 755 genProto.sh
  706  cat>genProto.sh 
  707  history
