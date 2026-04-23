package com.example.hyrule;

import com.example.hyrule.service.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HyruleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyruleApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(MaterialService materialService) {

        return args -> {

            System.out.println("=== INICIANDO APP ===");
            materialService.sortedMaterialsByPrice().forEach(m ->
                    System.out.println("[HYRULE-DB] Name: " + m.getName() + " | Category: " + m.getCategory() + " | Price: " + m.getPrice() + " Rupees")
            );
        };
    }

}
