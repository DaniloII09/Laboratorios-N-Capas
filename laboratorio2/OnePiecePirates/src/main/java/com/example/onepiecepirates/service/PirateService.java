package com.example.onepiecepirates.service;

import com.example.onepiecepirates.model.entity.Pirate;

import java.util.List;
import java.util.UUID;

public interface PirateService {
    void createPirate(Pirate pirate);
    List<Pirate> getAllPirates();
    Pirate getPirateById(UUID id);
    void updatePirate(UUID id, Pirate pirate);
    Pirate deletePirate(UUID id);
}
