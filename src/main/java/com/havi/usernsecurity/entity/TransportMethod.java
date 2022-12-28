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
public class TransportMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transMethodId;
    private String method;
    private Long priceForItem;

    @ManyToMany(mappedBy = "transportMethods")
    private Set<Transport> transports = new HashSet<>();
}
