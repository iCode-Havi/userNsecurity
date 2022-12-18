package com.havi.usernsecurity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class RegistrationAgent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agentId;
    private String email;
    private String name;
    private String province;
    private String district;
    private String contact;
    private Long registrationAmount;
    private String paymentForA;
    private Long payedRegistrationAmount;

    @OneToMany(mappedBy = "registrationAgent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Set<CardDetail> cardDetails = new HashSet<>();

    @OneToMany(mappedBy = "registrationAgent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Set<Transporter> transporters = new HashSet<>();

    @OneToMany(mappedBy = "registrationAgent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Set<Farmer> farmers = new HashSet<>();
}
