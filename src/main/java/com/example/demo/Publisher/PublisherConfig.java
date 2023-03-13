package com.example.demo.Publisher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration()
public class PublisherConfig {
    @Bean(name="publisher")
    CommandLineRunner commandLineRunner(PublisherRepository publisherRepository){
        return args -> {
            Publisher publisher1=new Publisher("Google",
                    "Miss Lin",
                    "26993344",
                    "Taichung");
            Publisher publisher2=new Publisher("Facebook",
                    "Miss FBI",
                    "26997788",
                    "Taipei");
            Publisher publisher3=new Publisher("Line",
                    "Mr Line",
                    "26994455",
                    "Homo");
            publisherRepository.saveAll(List.of(publisher1,publisher2,publisher3));
        };
    };
}
