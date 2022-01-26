package com.example.demo.controller;

import com.example.demo.model.MyObject;
import com.example.demo.repository.MyRepository;
import com.example.demo.services.MyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.of;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class MyController {
    private final MyService myService;

    @PostMapping
    public void save(@RequestBody MyObject request) {
        log.info("Saving request => {}", request);
        myService.save(request);
    }

    @GetMapping("/{key}")
    public ResponseEntity<MyObject> getByKey(@PathVariable String key) {
        return of(myService.findByKey(key));
    }
}
