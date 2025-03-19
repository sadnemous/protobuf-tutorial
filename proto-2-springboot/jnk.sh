ls -l /home/soumen/java_lab/proto/protobuf-tutorial/proto-2-springboot/scripts/openapi-generator-cli.jar
ls -l /home/soumen/java_lab/proto/protobuf-tutorial/proto-2-springboot/scripts/../resources/users.yaml
ls -l /home/soumen/java_lab/proto/protobuf-tutorial/proto-2-springboot/scripts/../configs/config-delegate.json


java -jar openapi-generator-cli.jar generate \
-i /home/soumen/java_lab/proto/protobuf-tutorial/proto-2-springboot/scripts/../resources/users.yaml \
-o config-delegate \
-c /home/soumen/java_lab/proto/protobuf-tutorial/proto-2-springboot/scripts/../configs/config-delegate.json
