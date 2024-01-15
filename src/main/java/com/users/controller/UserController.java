package com.users.controller;

import com.users.dto.CreateUserRequest;
import com.users.dto.UserInfoDto;
import org.springframework.http.ResponseEntity;


public interface UserController {

    ResponseEntity<UserInfoDto> getUserInfoByUuid();

    ResponseEntity<UserInfoDto> createUser(CreateUserRequest createUserRequest);
}
