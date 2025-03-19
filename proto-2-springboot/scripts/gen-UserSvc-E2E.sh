CONFIG_FF=$1
SCRIPTSDIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
OPENAPI_JAR=$SCRIPTSDIR/openapi-generator-cli.jar
if [ ! -f $OPENAPI_JAR ]; then
    wget wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.12.0/openapi-generator-cli-7.12.0.jar -O openapi-generator-cli.jar -O $OPENAPI_JAR
fi
OAS3_FF=$SCRIPTSDIR/../resources/users.yaml

if [ -z "$CONFIG_FF" ]; then
  CONFIG_FF=$SCRIPTSDIR/../configs/config-delegate.json
fi

OUTDIR=$(basename $CONFIG_FF|sed 's;.json;;g')
groupId=$(cat $CONFIG_FF|grep groupId|tr -d ', "'|cut -d: -f2)
basePackage=$(cat $CONFIG_FF|grep basePackage|tr -d ', "'|cut -d: -f2)
artifactId=$(cat $CONFIG_FF|grep artifactId|tr -d ', "'|cut -d: -f2)

java -jar $OPENAPI_JAR generate -i $OAS3_FF -o $OUTDIR -c $CONFIG_FF
cp -r $SCRIPTSDIR/grdl/* $OUTDIR/
cp $SCRIPTSDIR/curl-UserSvc.sh $OUTDIR/
cat $SCRIPTSDIR/grdl/build.gradle.kts|sed "s;_group_;$groupId;g"> $OUTDIR/build.gradle.kts
cat $SCRIPTSDIR/grdl/settings.gradle.kts|sed "s;_appname_;$artifactId;g"> $OUTDIR/settings.gradle.kts

mkdir -p $OUTDIR/src/main/java/com/example/users/controller/ $OUTDIR/src/main/java/com/example/users/service/
cp $SCRIPTSDIR/../classes/controller/*.java $OUTDIR/src/main/java/com/example/users/controller/
cp $SCRIPTSDIR/../classes/service/*.java $OUTDIR/src/main/java/com/example/users/service/
rm $OUTDIR/pom.xml

