package com.example.demo.Guest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GuestConfig {

    @Bean(name = "guest")
    CommandLineRunner commandLineRunner(
            GuestRepository guestRepository) {
        return args -> {
            Guest guest1 = new Guest("Ming",
                    SEX.MALE,
                    "0987523523",
                    "Taichung"
            );
            Guest guest2 = new Guest("Hong",
                    SEX.MALE,
                    "0922888322",
                    "Taichung"
            );
            Guest guest3 = new Guest("Lux",
                    SEX.FEMALE,
                    "098932743",
                    "Taichung"
            );
            guestRepository.saveAll(List.of(guest1,guest2,guest3));
        };
    }
}
