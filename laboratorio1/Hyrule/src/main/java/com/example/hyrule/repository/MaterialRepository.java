package com.example.hyrule.repository;

import com.example.hyrule.common.MaterialList;
import com.example.hyrule.domain.entity.Material;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MaterialRepository {
    private final MaterialList materialList;

    public List<Material> findAll() {
        return materialList.getMaterials();
    }
}
