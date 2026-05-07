package com.example.onepiecepirates.service.impl;

import com.example.onepiecepirates.model.entity.Pirate;
import com.example.onepiecepirates.repository.PirateRepository;
import com.example.onepiecepirates.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PirateServiceImpl implements PirateService {
    private final PirateRepository pirateRepository;

    @Override
    public void createPirate(Pirate pirate) {
        pirateRepository.save(pirate);
    }

    @Override
    public void getAllPirates() {
        pirateRepository.findAll();
    }

    @Override
    public Pirate getPirateById(UUID id) {
        return pirateRepository.getReferenceById(id);
    }

    @Override
    public void updatePirate(UUID id, Pirate pirate) {
        Pirate existsPirate =  pirateRepository.getReferenceById(id);
        existsPirate.setName(pirate.getName());
        existsPirate.setBounty(pirate.getBounty());
        existsPirate.setCrew(pirate.getCrew());
        existsPirate.setIsAlive(pirate.getIsAlive());
        pirateRepository.save(existsPirate);
    }

    @Override
    public Pirate deletePirate(UUID id) {
        Pirate existsPirate =  pirateRepository.getReferenceById(id);
        pirateRepository.delete(existsPirate);
        return existsPirate;
    }
}
