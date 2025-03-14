package com.lucasvm.UserRegistration_ViaCEP_DB.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CepResponse {

    private String cep;
    @JsonProperty("regiao")
    private String region;
    @JsonProperty("estado")
    private String state;
    @JsonProperty("localidade")
    private String city;
    @JsonProperty("bairro")
    private String district;
    @JsonProperty("logradouro")
    private String street;

}
