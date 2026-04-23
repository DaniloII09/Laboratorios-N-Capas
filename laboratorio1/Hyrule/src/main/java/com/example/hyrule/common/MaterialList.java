package com.example.hyrule.common;

import com.example.hyrule.domain.entity.Material;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialList {
    private final List<Material> materials;

    public MaterialList() {
        this.materials = new ArrayList<>();

        this.materials.add(Material.builder()
                .id(1L)
                .name("Keese Wing")
                .category("Monster Part")
                .effect("None")
                .price(3.00)
                .ubication("Hyrule Castle")
                .rarity("Common")
                .build());

        this.materials.add(Material.builder()
                .id(2L)
                .name("Hearty Truffle")
                .category("Mushroom")
                .effect("Hearty")
                .price(12.50)
                .ubication("Akkala Region")
                .rarity("Uncommon")
                .build());

        this.materials.add(Material.builder()
                .id(3L)
                .name("Dragon Scale")
                .category("Dragon Part")
                .effect("Fireproof")
                .price(150.00)
                .ubication("Death Mountain")
                .rarity("Rare")
                .build());

        this.materials.add(Material.builder()
                .id(4L)
                .name("Silent Princess")
                .category("Flower")
                .effect("Stealth Up")
                .price(25.00)
                .ubication("Kokiri Forest")
                .rarity("Uncommon")
                .build());

        this.materials.add(Material.builder()
                .id(5L)
                .name("Ancient Gear")
                .category("Ancient Part")
                .effect("None")
                .price(80.00)
                .ubication("Akkala Ancient Tech Lab")
                .rarity("Rare")
                .build());

        this.materials.add(Material.builder()
                .id(6L)
                .name("Bokoblin Horn")
                .category("Monster Part")
                .effect("None")
                .price(2.50)
                .ubication("Faron Region")
                .rarity("Common")
                .build());

        this.materials.add(Material.builder()
                .id(7L)
                .name("Star Fragment")
                .category("Mineral")
                .effect("Attack Up")
                .price(300.00)
                .ubication("Eldin Canyon")
                .rarity("Legendary")
                .build());

        this.materials.add(Material.builder()
                .id(8L)
                .name("Sunshroom")
                .category("Mushroom")
                .effect("Warm Up")
                .price(8.00)
                .ubication("Eldin Region")
                .rarity("Common")
                .build());
    }

    public List<Material> getMaterials() {
        return materials;
    }
}
