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

//    @RequestMapping("/{account}")
//    public User getUser(@PathVariable("account") String account) {
//        return new User(account,userRepository.getPassword(account), userRepository.getUsername(account),
//                userRepository.getMail(account), userRepository.getRole(account), userRepository.getTelephone(account),
//                userRepository.getQQ(account), userRepository.getWechat(account), userRepository.getStatement(account));
//    }

//    @RequestMapping("/{account}")
//    public User getUser(@PathVariable("account") String account) {
//        return userRepository.getUserByAccount(account);
//    }

    //封装表单参数
    //url格式  localhost:8080/user/test?account=10001
    @RequestMapping("/getuserinfo")
    @ResponseBody
    public User getUser(User user) {
        return userRepository.getUserByAccount(user.getAccount());
    }

    //url格式  localhost:8080/user/insertuser?account=10002&password=1234&username=cool&mail=940553959@qq.com&role=USER
    @RequestMapping("/insertuser")
    @ResponseBody
    public void insertUser(User user) {
        userRepository.insertUser(user);
    }


}
