package com.havi.usernsecurity.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Transporter {
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
  private String recommender;
  private Long offerIds;
  private String transportOption;
  private Long transportAmount;
  private String registerMethod;

  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
  @JoinColumn(name = "agent_id", foreignKey = @ForeignKey(name = "transporter_fk1_agent_id"))
  RegistrationAgent registrationAgent;
}
