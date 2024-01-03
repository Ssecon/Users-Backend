package com.users.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USER_PASSWORDS")
public class UserInfo {

    @Id
    @JsonProperty(value = "id")
    Integer id;

    @JsonProperty(value = "uuid")
    String uuid;

    @JsonProperty(value = "user_name")
    String UserName;

    @JsonProperty(value = "user_email")
    String UserEmail;

}