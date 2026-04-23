package com.example.hyrule.service;

import com.example.hyrule.domain.entity.Material;
import com.example.hyrule.repository.MaterialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaterialService {
    private final MaterialRepository materialRepository;

    public List<Material> findAll() {
        return materialRepository.findAll();
    }

    public List<Material> sortedMaterialsByPrice() {
        return findAll()
                .stream()
                .sorted((m1, m2) -> Double.compare(m2.getPrice(), m1.getPrice()))
                .toList();
    }

    public Material findHigherPriceMaterial() {
        return sortedMaterialsByPrice().getFirst();
    }

    public List<Material> findLegendarysMaterials() {
        return findAll()
                .stream()
                .filter(m -> m.getRarity().equals("Legendary"))
                .toList();
    }

    public List<String> findUniqueUbications() {
        return findAll()
                .stream()
                .map(Material::getUbication)
                .toList()
                .stream()
                .distinct()
                .toList();
    }
}
