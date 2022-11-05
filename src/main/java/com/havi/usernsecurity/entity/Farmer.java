package com.havi.usernsecurity.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long code;
    private Long contact;
    private Long password;
    private Long nicUrl;
    private Long name;
    private String registerStatus;
    private Long email;
    private Long role;
    private Long adminStatus;
    private Long registerDate;
    private String registerMethod;
    private Long rate;
    private String rateAmount;
}
