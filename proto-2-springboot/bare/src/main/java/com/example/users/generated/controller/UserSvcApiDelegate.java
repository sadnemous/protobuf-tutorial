package com.example.users.generated.controller;

import com.example.users.generated.model.Status;
import com.example.users.generated.model.UserRequest;
import com.example.users.generated.model.UserResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link UserSvcApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-19T11:36:49.379298638-05:00[America/Chicago]")
public interface UserSvcApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /usrsvc/getuser
     *
     * @param userRequest  (required)
     * @return OK (status code 200)
     *         or Default error response (status code 200)
     * @see UserSvcApi#userSvcGetUser
     */
    default ResponseEntity<UserResponse> userSvcGetUser(UserRequest userRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"fname\" : \"fname\", \"lname\" : \"lname\", \"userId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
