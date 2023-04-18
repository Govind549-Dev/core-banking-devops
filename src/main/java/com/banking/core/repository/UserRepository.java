package com.banking.core.repository;

import com.banking.core.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByIdentificationNumber(String identificationNumber);

}
