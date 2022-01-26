package com.example.demo.repository;

import com.example.demo.model.MyObject;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MyRepository extends MongoRepository<MyObject, String> {

    Optional<MyObject> findByKey(String key);
}
