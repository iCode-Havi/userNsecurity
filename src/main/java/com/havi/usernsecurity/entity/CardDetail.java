package com.havi.usernsecurity.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class CardDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardNumber;
    private LocalDateTime expireDate;
    private String type;
    private String ccv;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "agent_id", foreignKey = @ForeignKey(name = "registrationAgent_fk1_agent_id"))
    RegistrationAgent registrationAgent;
}
