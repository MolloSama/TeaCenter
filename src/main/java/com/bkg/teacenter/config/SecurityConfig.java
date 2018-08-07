package com.bkg.teacenter.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 自定义配置
     */
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests()
                .antMatchers("/css/**","/js/**","/fonts/**","/index")
                .permitAll()//都可以访问
                .antMatchers("user/**").hasRole("ADMIN")//需要管理员权限
                .and()
                .formLogin()//基于Form表单登录验证
                .loginPage("/login").failureUrl("/login-error");//自定义登录界面
    }

    /**
     * 认证信息管理
     */
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()//认证信息存储于内存中
                .withUser("duxihu").password("{noop}888888").roles("ADMIN");

    }
}
