package com.lucasvm.UserRegistration_ViaCEP_DB.dtos;

import jakarta.validation.constraints.NotBlank;

public record UserDto(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String email, @NotBlank String phoneNumber, @NotBlank String cep) {
}
