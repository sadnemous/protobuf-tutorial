/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0-beta).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.users.generated.controller;

import com.example.users.generated.model.Status;
import com.example.users.generated.model.UserRequest;
import com.example.users.generated.model.UserResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-19T11:36:49.379298638-05:00[America/Chicago]")
@Validated
@Api(value = "UserSvc", description = "the UserSvc API")
public interface UserSvcApi {

    default UserSvcApiDelegate getDelegate() {
        return new UserSvcApiDelegate() {};
    }

    /**
     * POST /usrsvc/getuser
     *
     * @param userRequest  (required)
     * @return OK (status code 200)
     *         or Default error response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userSvcGetUser", notes = "", response = UserResponse.class, tags={ "UserSvc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponse.class),
        @ApiResponse(code = 200, message = "Default error response", response = Status.class) })
    @RequestMapping(value = "/usrsvc/getuser",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<UserResponse> userSvcGetUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserRequest userRequest) {
        return getDelegate().userSvcGetUser(userRequest);
    }

}
