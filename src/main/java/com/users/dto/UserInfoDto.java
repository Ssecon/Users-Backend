package com.users.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserInfoDto {

    Integer id;
    String uuid;
    String UserName;
    String UserEmail;

}
