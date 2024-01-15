package com.users.service;

import com.users.dto.CreateUserRequest;
import com.users.dto.UserInfoDto;

public interface CreateUserService {
    UserInfoDto createUser(CreateUserRequest createUserRequest);
}
