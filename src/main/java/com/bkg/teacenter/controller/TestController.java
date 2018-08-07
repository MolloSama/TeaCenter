package com.bkg.teacenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TestController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @RequestMapping("/hello")
    public String index1() {
        return "Hello World";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String index2(){

        String sql = "insert into Dictionary_Element values ('80', '4', '中东欧', '08')";
        jdbcTemplate.execute(sql);
        System.out.println("执行完成");

        return "hello spring boot";
    }

}
