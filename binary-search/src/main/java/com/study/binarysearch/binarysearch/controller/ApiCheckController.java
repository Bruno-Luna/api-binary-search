package com.study.binarysearch.binarysearch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiCheckController {
    @GetMapping("/health-check")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok().build();
    }
    @GetMapping("/health")
    public String healthCheck1() {
        return "olá";
    }

    @GetMapping("/health-check")
    ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("NumberSearch API running on port 8080");
    }

}
