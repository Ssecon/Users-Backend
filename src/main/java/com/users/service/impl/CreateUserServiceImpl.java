package com.users.service.impl;

import com.users.converter.UserConverter;
import com.users.dto.CreateUserRequest;
import com.users.dto.UserInfoDto;
import com.users.entity.UserInfoEntity;
import com.users.repository.UserInfoRepository;
import com.users.service.CreateUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HexFormat;
import java.util.UUID;

@Slf4j
@Service
public class CreateUserServiceImpl implements CreateUserService {

    public CreateUserServiceImpl(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    UserInfoRepository userInfoRepository;

    @Override
    public UserInfoDto createUser(CreateUserRequest createUserRequest) {
        log.info("Comienza la ejecucion del metodo createUser.");
        log.info("Request: {}",createUserRequest);

        //UUID Generado a partir del email del usuario.
        //Precondición: El email del usuario debe ser unico.
        UUID userUuid = generateUUID(createUserRequest.getUserEmail());
        UserInfoEntity userInfoEntity = UserConverter.createUserRequestToUserInfo(createUserRequest,userUuid);
        try{
            userInfoRepository.save(userInfoEntity);
        } catch (Exception ex) {
            log.error("Ocurrio un error al persistir el registro en la bbdd.");
        }
        return null;
    }

    private UUID generateUUID(String email){
        UUID uuid = UUID.nameUUIDFromBytes(email.getBytes());
        log.info("UUID Generado: {}", uuid);
        return uuid;
    }

    private Byte[] generateSalt(){
        return null;
    }

    private void persistUserAndPassword(){

    }
}
