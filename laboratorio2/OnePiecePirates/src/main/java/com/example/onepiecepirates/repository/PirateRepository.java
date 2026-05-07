package com.example.onepiecepirates.repository;

import com.example.onepiecepirates.model.entity.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, UUID> {
}
