package com.example.demo.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean(name = "book")
    CommandLineRunner commandLineRunner(
            BookRepository repository) {
        return args -> {
            Book book1 = new Book("book1",
                    "author1",
                    1200,
                    "Taichung",
                    "Good book"
            );
            Book book2 = new Book("book2",
                    "author2",
                    799,
                    "TaiLand",
                    "Excelent"
            );
            Book book3 = new Book("book3",
                    "author3",
                    989,
                    "Taipei",
                    "so good"
            );
            repository.saveAll(List.of(book1, book2, book3));
        };
    }
}
