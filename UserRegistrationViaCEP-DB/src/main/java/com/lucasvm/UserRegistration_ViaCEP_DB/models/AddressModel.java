package com.lucasvm.UserRegistration_ViaCEP_DB.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "addresses")
@Data
public class AddressModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String cep;
    private String region;
    private String state;
    private String city;
    private String district;
    private String street;
    @ManyToOne
    @JsonIgnore
    private UserModel user;
}
