package com.vnext.springsecurity.controller;

import com.vnext.springsecurity.jwt.JwtTokenProvider;
import com.vnext.springsecurity.payload.LoginRequest;
import com.vnext.springsecurity.payload.LoginResponse;
import com.vnext.springsecurity.payload.RandomStuff;
import com.vnext.springsecurity.repository.UserRepository;
import com.vnext.springsecurity.user.CustomUserDetail;
import com.vnext.springsecurity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/login")
    public LoginResponse authenticateUser(@RequestBody LoginRequest loginRequest){
        System.out.println("principal=>>");
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.generateToken((CustomUserDetail) authentication.getPrincipal());
        return new LoginResponse(jwt);
    }

    @GetMapping("/random")
    public RandomStuff randomStuff(){
        return new RandomStuff("JWT Hợp lệ mới có thể thấy được message này");
    }

    @GetMapping("/list")
    public ResponseEntity<List<User>> all(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{username}")
    public ResponseEntity<User> find(@PathVariable("username") String username){
        return new ResponseEntity<>(userRepository.findUserByUsername(username),HttpStatus.OK);
    }
}
