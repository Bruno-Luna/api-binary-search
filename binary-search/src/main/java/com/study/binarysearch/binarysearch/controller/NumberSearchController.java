package com.study.binarysearch.binarysearch.controller;

import com.study.binarysearch.binarysearch.dto.NumberSearchRequestDTO;
import com.study.binarysearch.binarysearch.dto.NumberSearchResponseDTO;
import com.study.binarysearch.binarysearch.service.NumberSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/list")
@RequiredArgsConstructor
public class NumberSearchController {

    private final NumberSearchService listService;

    @PostMapping("/find")
    public NumberSearchResponseDTO findIndexByBinary(@RequestBody NumberSearchRequestDTO requestList) {
        return listService.searchByBinary(requestList);
    }
}