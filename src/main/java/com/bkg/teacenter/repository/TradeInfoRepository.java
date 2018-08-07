package com.bkg.teacenter.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TradeInfoRepository {
    private JdbcTemplate jdbcTemplate;

    public TradeInfoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
