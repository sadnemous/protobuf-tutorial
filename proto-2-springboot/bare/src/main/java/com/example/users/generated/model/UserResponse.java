package com.example.users.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-19T11:36:49.379298638-05:00[America/Chicago]")
public class UserResponse   {
  @JsonProperty("userId")
  private Long userId;

  @JsonProperty("fname")
  private String fname;

  @JsonProperty("lname")
  private String lname;

  public UserResponse userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")


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
  @ApiModelProperty(value = "")


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
  @ApiModelProperty(value = "")


  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

