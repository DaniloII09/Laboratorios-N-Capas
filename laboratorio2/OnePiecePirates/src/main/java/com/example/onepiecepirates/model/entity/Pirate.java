package com.example.onepiecepirates.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Pirate")
public class Pirate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "bounty")
    private Double bounty;

    @Column(name = "crew")
    private String crew;

    @Column(name = "isAlive")
    private Boolean isAlive;
}
