package com.lucasvm.UserRegistration_ViaCEP_DB.repositories;

import com.lucasvm.UserRegistration_ViaCEP_DB.models.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<AddressModel, UUID> {
}
