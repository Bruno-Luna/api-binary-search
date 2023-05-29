package com.study.binarysearch.binarysearch.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class NumberSearchRequestDTO {
    private List<Integer> numbers;
    private int target;

    public NumberSearchRequestDTO(List<Integer> numbers, int target) {
        this.numbers = numbers;
        this.target = target;
    }
}
