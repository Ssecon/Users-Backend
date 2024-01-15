package com.users.converter;

import com.users.dto.CreateUserRequest;
import com.users.entity.UserInfoEntity;

import java.util.UUID;

public class UserConverter {

    public static UserInfoEntity createUserRequestToUserInfo(CreateUserRequest createUserRequest, UUID uuid){
        UserInfoEntity response = new UserInfoEntity();
        response.setUserName(createUserRequest.getUserName());
        response.setUserEmail(createUserRequest.getUserEmail());
        response.setUuid(uuid.toString());
        response.setId(1);

        return response;
    }
}
