package com.havi.usernsecurity.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long code;
    private Long contact;
    private Long password;
    private Long nicUrl;
    private String name;
    private String registerStatus;
    private String email;
    private String role;
    private String adminStatus;
    private LocalDateTime registerDate;
    private String registerMethod;
    private String rate;
    private Integer rateAmount;
}
