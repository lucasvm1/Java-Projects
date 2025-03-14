package com.lucasvm.UserRegistration_ViaCEP_DB.dtos;

import java.util.UUID;

public record AddressDto(UUID userId, String cep, String region, String state, String city, String district, String street) {
}
