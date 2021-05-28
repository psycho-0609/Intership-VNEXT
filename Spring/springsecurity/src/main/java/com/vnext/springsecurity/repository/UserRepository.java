package com.vnext.springsecurity.repository;

import com.vnext.springsecurity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String userName);
}
