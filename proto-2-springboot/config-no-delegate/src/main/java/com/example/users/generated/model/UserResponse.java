package com.example.users.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-16T20:49:49.132160023-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class UserResponse {

  private @Nullable Long userId;

  private @Nullable String fname;

  private @Nullable String lname;

  public UserResponse userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserResponse fname(String fname) {
    this.fname = fname;
    return this;
  }

  /**
   * Get fname
   * @return fname
   */
  
  @Schema(name = "fname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fname")
  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public UserResponse lname(String lname) {
    this.lname = lname;
    return this;
  }

  /**
   * Get lname
   * @return lname
   */
  
  @Schema(name = "lname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lname")
  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.userId, userResponse.userId) &&
        Objects.equals(this.fname, userResponse.fname) &&
        Objects.equals(this.lname, userResponse.lname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fname, lname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fname: ").append(toIndentedString(fname)).append("\n");
    sb.append("    lname: ").append(toIndentedString(lname)).append("\n");
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

