package com.example.users.generated.model;

import java.net.URI;
import java.util.Objects;
import com.example.users.generated.model.GoogleProtobufAny;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The &#x60;Status&#x60; type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each &#x60;Status&#x60; message contains three pieces of data: error code, error message, and error details. You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).
 */

@Schema(name = "Status", description = "The `Status` type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data: error code, error message, and error details. You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-16T18:33:19.267256095-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class Status {

  private @Nullable Integer code;

  private @Nullable String message;

  @Valid
  private List<GoogleProtobufAny> details = new ArrayList<>();

  public Status code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code].
   * @return code
   */
  
  @Schema(name = "code", description = "The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Status message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.
   * @return message
   */
  
  @Schema(name = "message", description = "A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Status details(List<GoogleProtobufAny> details) {
    this.details = details;
    return this;
  }

  public Status addDetailsItem(GoogleProtobufAny detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * A list of messages that carry the error details.  There is a common set of message types for APIs to use.
   * @return details
   */
  @Valid 
  @Schema(name = "details", description = "A list of messages that carry the error details.  There is a common set of message types for APIs to use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public List<GoogleProtobufAny> getDetails() {
    return details;
  }

  public void setDetails(List<GoogleProtobufAny> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.code, status.code) &&
        Objects.equals(this.message, status.message) &&
        Objects.equals(this.details, status.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

