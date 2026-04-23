package com.example.hyrule.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Material {
    private Long id;
    private String name;
    private String category;
    private String effect;
    private Double price;
    private String ubication;
    private String rarity;
}
