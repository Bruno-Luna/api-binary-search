package com.study.binarysearch.binarysearch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@Controller
public class ApiCheckController {
    @GetMapping("/health-check")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok().build();
    }
    @GetMapping("/health")
    public String healthCheck1() {
        return "olá";
    }

}
