package com.bkg.teacenter.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //实体
public class User {



    @Id
    private String account;  //唯一标识
    private String password;
    private String username;
    private String mail;
    private String role;
    private String telephone;
    private String qq;
    private String wechat;
    private String statement;

    protected User() {//无参默认构造器
    }

    public User(String account, String password, String username, String mail, String role, String telephone, String qq, String wechat, String statement) {
        this.account = account;
        this.password = password;
        this.username = username;
        this.mail = mail;
        this.role = role;
        this.telephone = telephone;
        this.qq = qq;
        this.wechat = wechat;
        this.statement = statement;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", mail='" + mail + '\'' +
                ", role='" + role + '\'' +
                ", telephone='" + telephone + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", statement='" + statement + '\'' +
                '}';
    }
}