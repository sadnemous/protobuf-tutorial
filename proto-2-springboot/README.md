1. prepare sample proto file:  `users.proto`
2. `./gen-Proto-to-OAS3.sh`
3. it will produce `users.yaml`
4. download this jar from 1.3 section - https://github.com/OpenAPITools/openapi-generator
  - more specifically `wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.12.0/openapi-generator-cli-7.12.0.jar -O openapi-generator-cli.jar`
5. prepare  `config.json`
6. `./gen-Config-Based-UserSvc.sh config.json`
7. code will be generated in `users`
9. Example to see how it works end to end, run 
```bash
  cd scripts
  ./gen-UserSvc-E2E.sh
  cd config-delegate
  ./gradlew bootRun

  # open http://localhost:9090/swagger-ui/index.html# to test through swagger
  # or just run 
  curl-UserSvc.sh
```


