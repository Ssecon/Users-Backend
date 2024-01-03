package com.users.controller;

import com.users.dto.UserInfoDto;
import com.users.entity.UserInfo;
import org.springframework.http.ResponseEntity;

public interface UserController {

    ResponseEntity<UserInfoDto> getUserInfoByUuid();

    ResponseEntity<UserInfoDto> createUser();
}
