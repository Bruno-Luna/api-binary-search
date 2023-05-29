package com.study.binarysearch.binarysearch.service;

import com.study.binarysearch.binarysearch.dto.NumberSearchRequestDTO;
import com.study.binarysearch.binarysearch.dto.NumberSearchResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NumberSearchService {

    public NumberSearchResponseDTO searchByBinary(NumberSearchRequestDTO listRequest) {
        NumberSearchResponseDTO response = new NumberSearchResponseDTO();

        var targetIndex = listRequest.getNumbers().indexOf(listRequest.getTarget());
        response.setTargetIndex(targetIndex);

        response.setTarget(listRequest.getTarget());

        response.setOperations(-1);

        return response;
    }
}
