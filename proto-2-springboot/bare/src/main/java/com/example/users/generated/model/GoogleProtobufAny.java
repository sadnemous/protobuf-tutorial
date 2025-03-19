package com.example.users.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains an arbitrary serialized message along with a @type that describes the type of the serialized message.
 */
@ApiModel(description = "Contains an arbitrary serialized message along with a @type that describes the type of the serialized message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-19T11:36:49.379298638-05:00[America/Chicago]")
public class GoogleProtobufAny extends HashMap<String, Object>  {
  @JsonProperty("@type")
  private String atType;

  public GoogleProtobufAny atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * The type of the serialized message.
   * @return atType
  */
  @ApiModelProperty(value = "The type of the serialized message.")


  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProtobufAny googleProtobufAny = (GoogleProtobufAny) o;
    return Objects.equals(this.atType, googleProtobufAny.atType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProtobufAny {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

