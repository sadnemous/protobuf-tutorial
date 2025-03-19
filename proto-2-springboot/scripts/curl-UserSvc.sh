curl -X 'POST' \
  'http://localhost:9090/usrsvc/getuser' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d "{
  \"userId\": ${1:-2}
}"
echo ""
