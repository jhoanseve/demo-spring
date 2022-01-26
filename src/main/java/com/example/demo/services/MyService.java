package com.example.demo.services;

import com.example.demo.model.MyObject;
import com.example.demo.repository.MyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyService {
    private final MyRepository myRepository;

    @CachePut(cacheNames = "myObject", key = "#object.key")
    public MyObject save(MyObject object) {
        return myRepository.save(object);
    }

    @Cacheable(cacheNames = "myObject", key = "#key")
    public Optional<MyObject> findByKey(String key) {
        return null;
    }
}
