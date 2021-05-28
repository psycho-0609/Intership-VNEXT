package com.vnext.springsecurity.service;

import com.vnext.springsecurity.repository.UserRepository;
import com.vnext.springsecurity.user.CustomUserDetail;
import com.vnext.springsecurity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user  = userRepository.findUserByUsername(userName);
        System.out.println("find user: "+user.getUsername());
        if(user == null){
            throw new UsernameNotFoundException(userName);
        }
        System.out.println("=>>found user: "+user.getUsername());
        return new CustomUserDetail(user);
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("User not found with id : " + id)
        );

        return new CustomUserDetail(user);
    }
}
