package com.bkg.teacenter.controller;

import com.bkg.teacenter.domain.User;
import com.bkg.teacenter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //查词所有用户
    @GetMapping("/userlist")
    public ModelAndView userList(Model model){
        model.addAttribute("userList",userRepository.findAll());
        model.addAttribute("title","用户管理");
        return  new ModelAndView("user/list","userModel",model);
    }
    //根据id 查询用户
    @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id") String id, Model model){
        Optional<User> user= userRepository.findById(Long.valueOf(id));
        model.addAttribute("user",user.get());
        model.addAttribute("title","查看用户");
        return new ModelAndView("user/view" ,"userModel",model);
    }

    //获取创建表单页面
    @GetMapping("/form")
    public ModelAndView createForm(Model model){
        model.addAttribute("user",new User(null,null,null, null, null, null, null, null));
        model.addAttribute("title","创建用户");
        return new ModelAndView("user/form","userModel",model);
    }

    //保存用户
    @PostMapping
    public ModelAndView saveOrUpdateUser(User user){
        user =userRepository.save(user);
        return new ModelAndView("redirect:/user/userlist");
    }

    //根据id删除用户
    @GetMapping(value = "delete/{id}")
    public ModelAndView delete(@PathVariable("id") String id){
        userRepository.deleteById(Long.valueOf(id));
        return new ModelAndView("redirect:/user/userlist");
    }

    //修改用户界面
    @GetMapping(value = "edit/{id}")
    public ModelAndView editForm(@PathVariable("id") String id,Model model){
        Optional<User> user =userRepository.findById(Long.valueOf(id));
        model.addAttribute("user",user);
        model.addAttribute("title","编辑用户");
        return new ModelAndView("user/form" ,"userModel",model);
    }
}