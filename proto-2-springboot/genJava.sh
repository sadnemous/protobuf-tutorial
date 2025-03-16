OPENAPI_JAR=$PWD/openapi-generator-cli.jar
OAS3=$PWD/users.yaml
CONFIG=$PWD/config.json

java -jar $OPENAPI_JAR generate -i $OAS3 -o users -c $CONFIG
cp -r grdl/* users

