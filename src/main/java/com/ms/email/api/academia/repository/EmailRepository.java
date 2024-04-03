package com.ms.email.api.academia.repository;

import com.ms.email.api.academia.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {
}
