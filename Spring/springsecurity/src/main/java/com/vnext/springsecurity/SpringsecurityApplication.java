package com.vnext.springsecurity;

import com.vnext.springsecurity.repository.UserRepository;
import com.vnext.springsecurity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringsecurityApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("hung");
        user.setPassword(passwordEncoder.encode("123456"));
        userRepository.save(user);
        System.out.println(user);
    }
}
