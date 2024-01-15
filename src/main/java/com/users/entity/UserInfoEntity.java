package com.users.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USER_INFO")
public class UserInfoEntity {

    @Id
    @Column(name = "id")
    Integer id;

    @JsonProperty(value = "uuid")
    @Column(name = "uuid")
    String uuid;

    @JsonProperty(value = "user_name")
    @Column(name = "user_name")
    String UserName;

    @JsonProperty(value = "user_email")
    @Column(name = "user_email")
    String UserEmail;

}