package com.havi.usernsecurity.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter



public class Transporter {
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
  private String recommender;
  private Long offerIds;
  private String transportOption;
  private Long transportAmount;
  private String registerMethod;
}