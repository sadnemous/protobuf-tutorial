package com.example.users.generated.controller;

import com.example.users.generated.model.Status;
import com.example.users.generated.model.UserRequest;
import com.example.users.generated.model.UserResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-16T20:45:09.814576130-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
@Controller
@RequestMapping("${openapi.titleFromAnnotation.base-path:}")
public class UserSvcApiController implements UserSvcApi {

    private final UserSvcApiDelegate delegate;

    public UserSvcApiController(@Autowired(required = false) UserSvcApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UserSvcApiDelegate() {});
    }

    @Override
    public UserSvcApiDelegate getDelegate() {
        return delegate;
    }

}
