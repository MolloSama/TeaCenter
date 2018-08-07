package com.bkg.teacenter.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getUsername(String account) {
        final String SELECT_USERNAME_BY_ACCOUNT =
                "select username from UserInfo where account='"+account+"'";
        return jdbcTemplate.queryForObject(SELECT_USERNAME_BY_ACCOUNT,String.class).trim();
    }

    public String getPassword(String account) {
        final String SELECT_PASSWORD_BY_ACCOUNT =
                "select password from UserInfo where account='"+account+"'";
        return jdbcTemplate.queryForObject(SELECT_PASSWORD_BY_ACCOUNT,String.class).trim();
    }

    public String getMail(String account) {
        final String SELECT_MAIL_BY_ACCOUNT =
                "select mail from UserInfo where account='"+account+"'";
        return jdbcTemplate.queryForObject(SELECT_MAIL_BY_ACCOUNT,String.class).trim();
    }

    public String getRole(String account) {
        final String SELECT_ROLE_BY_ACCOUNT =
                "select role from UserInfo where account='"+account+"'";
        return jdbcTemplate.queryForObject(SELECT_ROLE_BY_ACCOUNT,String.class).trim();
    }

    public String getTelephone(String account) {
        final String SELECT_TELEPHONE_BY_ACCOUNT =
                "select telephone from UserInfo where account='"+account+"'";
        return jdbcTemplate.queryForObject(SELECT_TELEPHONE_BY_ACCOUNT,String.class).trim();
    }

    public String getQQ(String account) {
        final String SELECT_QQ_BY_ACCOUNT =
                "select qq from UserInfo where account='"+account+"'";
        return jdbcTemplate.queryForObject(SELECT_QQ_BY_ACCOUNT,String.class).trim();
    }

    public String getWechat(String account) {
        final String SELECT_WECHAT_BY_ACCOUNT =
                "select wechat from UserInfo where account='"+account+"'";
        return jdbcTemplate.queryForObject(SELECT_WECHAT_BY_ACCOUNT,String.class).trim();
    }

    public String getStatement(String account) {
        final String SELECT_STATEMENT_BY_ACCOUNT =
                "select statement from UserInfo where account='"+account+"'";
        return jdbcTemplate.queryForObject(SELECT_STATEMENT_BY_ACCOUNT,String.class).trim();
    }
}
