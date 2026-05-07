package com.example.onepiecepirates.repository;

import com.example.onepiecepirates.model.entity.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PirateRepository extends JpaRepository<Pirate, UUID> {
}
