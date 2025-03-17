package com.example.users.generated.controller;

import com.example.users.generated.model.Status;
import com.example.users.generated.model.UserRequest;
import com.example.users.generated.model.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link UserSvcApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-16T20:49:57.455763847-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
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
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 6, \"details\" : [ { \"@type\" : \"@type\" }, { \"@type\" : \"@type\" } ], \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
