package com.example.users.generated.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-19T11:36:49.379298638-05:00[America/Chicago]")
@Controller
@RequestMapping("${openapi.titleFromAnnotation.base-path:}")
public class UserSvcApiController implements UserSvcApi {

    private final UserSvcApiDelegate delegate;

    public UserSvcApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) UserSvcApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UserSvcApiDelegate() {});
    }

    @Override
    public UserSvcApiDelegate getDelegate() {
        return delegate;
    }

}
