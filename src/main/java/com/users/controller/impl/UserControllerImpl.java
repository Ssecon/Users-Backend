package com.users.controller.impl;

import com.users.controller.UserController;
import com.users.dto.UserInfoDto;
import com.users.repository.UserInfoReporitory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserControllerImpl implements UserController {

    public UserControllerImpl(UserInfoReporitory userInfoReporitory) {
        this.userInfoReporitory = userInfoReporitory;
    }

    UserInfoReporitory userInfoReporitory;

    @Override
    public ResponseEntity<UserInfoDto> getUserInfoByUuid() {

        return null;
    }

    @Override
    public ResponseEntity<UserInfoDto> createUser() {
        return null;
    }
}
