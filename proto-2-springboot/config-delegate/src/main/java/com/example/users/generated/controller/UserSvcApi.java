/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.12.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.users.generated.controller;

import com.example.users.generated.model.Status;
import com.example.users.generated.model.UserRequest;
import com.example.users.generated.model.UserResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-16T20:49:57.455763847-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
@Validated
@Controller
@Tag(name = "UserSvc", description = "the UserSvc API")
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
    @Operation(
        operationId = "userSvcGetUser",
        tags = { "UserSvc" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
            }),
            @ApiResponse(responseCode = "default", description = "Default error response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Status.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/usrsvc/getuser",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<UserResponse> userSvcGetUser(
        @Parameter(name = "UserRequest", description = "", required = true) @Valid @RequestBody UserRequest userRequest
    ) {
        return getDelegate().userSvcGetUser(userRequest);
    }

}
