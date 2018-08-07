package com.bkg.teacenter.controller;

import com.bkg.teacenter.domain.User;
import com.bkg.teacenter.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/{account}")
    public User getUser(@PathVariable("account") String account) {
        return new User(account,userRepository.getPassword(account), userRepository.getUsername(account),
                userRepository.getMail(account), userRepository.getRole(account), userRepository.getTelephone(account),
                userRepository.getQQ(account), userRepository.getWechat(account), userRepository.getStatement(account));
    }
}
