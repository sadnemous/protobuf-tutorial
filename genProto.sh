SRC_DIR=proto
DST_DIR=users-java
SWAGGER=openapi
rm -fr $DST_DIR
rm -fr $SWAGGER
mkdir -p $DST_DIR
mkdir -p $SWAGGER

protoc -I=$SRC_DIR \
    --java_out=$DST_DIR \
    --openapi_out=$SWAGGER \
    $SRC_DIR/users.proto
