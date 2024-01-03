package com.users.repository;

import com.users.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoReporitory extends JpaRepository<Integer, UserInfo> {

}
