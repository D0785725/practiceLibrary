package com.example.demo.Record;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class RecordConfig {

    @Bean(name = "record")
    CommandLineRunner commandLineRunner(RecordRepository recordRepository){
        return args -> {
            Record record1=new Record( LocalDate.now());
            Record record2=new Record( LocalDate.now());
            Record record3=new Record( LocalDate.now());
            recordRepository.saveAll(List.of(record1,record2,record3));
        };
    };
}
