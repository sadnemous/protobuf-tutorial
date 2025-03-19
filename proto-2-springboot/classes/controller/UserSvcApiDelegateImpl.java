package com.example.users.controller;

import com.example.users.generated.controller.UserSvcApiDelegate;
import com.example.users.generated.model.UserRequest;
import com.example.users.generated.model.UserResponse;
import com.example.users.service.IUserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UserSvcApiDelegateImpl implements UserSvcApiDelegate {
    @Autowired
    IUserSvc userSvc;

    @Override
    public ResponseEntity<UserResponse> userSvcGetUser(UserRequest userRequest) {
        UserResponse userResponse = userSvc.getUser(userRequest);
        return ResponseEntity.ok(userResponse);
    }
}
