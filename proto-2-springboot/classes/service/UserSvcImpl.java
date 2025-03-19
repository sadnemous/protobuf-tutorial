package com.example.users.service;

import com.example.users.generated.model.UserRequest;
import com.example.users.generated.model.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserSvcImpl implements IUserSvc {
    @Override
    public UserResponse getUser(UserRequest userRequest) {
        Long userId = userRequest.getUserId();
        if (userId % 11 == 0) {
            return new UserResponse(userId, "E11even", "Millie-Bobby Brown");
        } else if (userId % 7 == 0) {
            return new UserResponse(userId, "7even", "E11even");
        } else if (userId % 5 == 0) {
            return new UserResponse(userId, "5andra", "Manchu");
        } else if (userId % 3 == 0) {
            return new UserResponse(userId, "Lub-<3", "Dvall");
        } else if (userId % 2 == 0) {
            return new UserResponse(userId, "Even", "Doe");
        } else {
            return new UserResponse(-1L, "Unknown", "Whale");
        }
    }
}
