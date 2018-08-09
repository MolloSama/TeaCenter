package com.bkg.teacenter.repository;

import com.bkg.teacenter.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User getUserByAccount(String account){
        final String SELECT_USER_BY_ACCOUNT =
                "select password, username, mail, role, telephone, qq, wechat, statement " +
                        "from UserInfo where account = '"+account+"'";
        List<Map<String, Object>> list =
                jdbcTemplate.queryForList(SELECT_USER_BY_ACCOUNT);
        Map<String, Object> map = list.get(0);
        return new User(account, map.get("password").toString(),map.get("username").toString(),
                map.get("mail").toString(), map.get("role").toString(), map.get("telephone").toString(),
                map.get("qq").toString(), map.get("wechat").toString(), map.get("statement").toString());
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

    //管理员添加新用户
    public void insertUser(User user){
        final String INSERT_USER =
                "insert into UserInfo values('"+user.getAccount()+"', '" +user.getPassword()+"', '"
                        +user.getUsername()+"', '" +user.getMail()+"', '"+user.getRole()+"','"
                        +user.getTelephone()+"','"+user.getQq()+"','"+user.getWechat()+"','"+user.getStatement()+"')";
        jdbcTemplate.update(INSERT_USER);
    }

    //管理员删除用户
    public void deleteUser(String account){
        final String DELETE_USER_BY_ACCOUNT =
                "delete from UserInfo where account = '"+account+"'";
        jdbcTemplate.update(DELETE_USER_BY_ACCOUNT);
    }
}
