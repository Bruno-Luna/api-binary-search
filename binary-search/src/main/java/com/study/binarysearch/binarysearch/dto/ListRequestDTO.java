package com.study.binarysearch.binarysearch.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ListRequestDTO {
    ArrayList<Integer> list;
    int target;

}
