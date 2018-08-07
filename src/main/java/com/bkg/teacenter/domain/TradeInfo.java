package com.bkg.teacenter.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //实体
public class TradeInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长策略
    private Long id;//唯一标识

    private String country;

    private String trade_flow;

    private int year;

    private String partner_country;

    private String product_number;

    private int trade_value;

    private int weight;

    private int trade_number;

    protected TradeInfo() {//无参默认构造器
    }


    public TradeInfo(String country, String trade_flow, int year, String partner_country, String product_number, int trade_value, int weight, int trade_number) {
        this.country = country;
        this.trade_flow = trade_flow;
        this.year = year;
        this.partner_country = partner_country;
        this.product_number = product_number;
        this.trade_value = trade_value;
        this.weight = weight;
        this.trade_number = trade_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTrade_flow() {
        return trade_flow;
    }

    public void setTrade_flow(String trade_flow) {
        this.trade_flow = trade_flow;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPartner_country() {
        return partner_country;
    }

    public void setPartner_country(String partner_country) {
        this.partner_country = partner_country;
    }

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public int getTrade_value() {
        return trade_value;
    }

    public void setTrade_value(int trade_value) {
        this.trade_value = trade_value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTrade_number() {
        return trade_number;
    }

    public void setTrade_number(int trade_number) {
        this.trade_number = trade_number;
    }

    @Override
    public String toString() {
        return "TradeInfo{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", trade_flow='" + trade_flow + '\'' +
                ", year=" + year +
                ", partner_country='" + partner_country + '\'' +
                ", product_number='" + product_number + '\'' +
                ", trade_value=" + trade_value +
                ", weight=" + weight +
                ", trade_number=" + trade_number +
                '}';
    }
}
