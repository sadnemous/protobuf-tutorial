conf=$1
if [ -n "$conf" ]; then
  OPENAPI_JAR=$PWD/openapi-generator-cli.jar
  OAS3=$PWD/users.yaml
  dir=$(echo $conf|sed 's;.json;;g')
  CONFIG=$PWD/$conf
  java -jar $OPENAPI_JAR generate -i $OAS3 -o $dir -c $CONFIG
  cp -r grdl/* users
fi

