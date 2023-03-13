package com.example.demo.Publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    PublisherRepository publisherRepository;

    @Autowired
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<Publisher> getPublishers() {
        return publisherRepository.findAll();
    }
}
