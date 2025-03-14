package com.lucasvm.UserRegistration_ViaCEP_DB.repositories;

import com.lucasvm.UserRegistration_ViaCEP_DB.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
