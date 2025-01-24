SRC_DIR=proto
DST_DIR=users-java
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/users.proto
