package com.study.binarysearch.binarysearch.controller;

import com.study.binarysearch.binarysearch.dto.ListRequestDTO;
import com.study.binarysearch.binarysearch.dto.ListResponseDTO;
import com.study.binarysearch.binarysearch.service.ListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController("/api/list")
@Controller
public class ListController {

    private final ListService listService;

    @GetMapping("/health")
    public String healthCheck1() {
        return "olá";
    }

    @PostMapping()
    public ListResponseDTO findIndexByBinary(@RequestBody ListRequestDTO requestList) {
        return  listService.searchByBinary(requestList);
    }
}
