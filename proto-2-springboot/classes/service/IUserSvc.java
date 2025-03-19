package com.example.users.service;

import com.example.users.generated.model.UserRequest;
import com.example.users.generated.model.UserResponse;
import org.springframework.stereotype.Service;

public interface IUserSvc {
    public UserResponse getUser(UserRequest userRequest);
}
