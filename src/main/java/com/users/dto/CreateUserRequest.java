package com.users.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateUserRequest {

    @JsonProperty(value = "username")
    String userName;
    @JsonProperty(value = "useremail")
    String userEmail;
}
