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
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transportId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "transport_transport_method",
            joinColumns = {@JoinColumn(name = "transport_id", foreignKey = @ForeignKey(name = "transport_fk1_trans_method_id"))},
            inverseJoinColumns = {@JoinColumn(name = "trans_method_id" , foreignKey = @ForeignKey(name = "transport_method_fk1_transport_id"))})
    private Set<TransportMethod> transportMethods = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "transporter_id", foreignKey = @ForeignKey(name = "transport_fk2_transporter_id"))
    private Transporter transporter;
}