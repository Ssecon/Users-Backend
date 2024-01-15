package com.users.controller.impl;

import com.users.controller.UserController;
import com.users.dto.CreateUserRequest;
import com.users.dto.UserInfoDto;
import com.users.service.CreateUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserControllerImpl implements UserController {

    public UserControllerImpl(CreateUserService createUserService) {
        this.createUserService = createUserService;
    }

    CreateUserService createUserService;

    @Override
    public ResponseEntity<UserInfoDto> getUserInfoByUuid() {

        return null;
    }

    @Override
    @PostMapping(path = "/CreateUser")
    public ResponseEntity<UserInfoDto> createUser(@RequestBody  CreateUserRequest createUserRequest) {
        return new ResponseEntity<>(createUserService.createUser(createUserRequest), HttpStatus.OK);
    }
}
