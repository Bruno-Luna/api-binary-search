package com.study.binarysearch.binarysearch.service;

import com.study.binarysearch.binarysearch.dto.ListRequestDTO;
import com.study.binarysearch.binarysearch.dto.ListResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ListService {


    public ListResponseDTO searchByBinary(ListRequestDTO listRequest) {
        ListResponseDTO response = new ListResponseDTO();
        var targetIndex = listRequest.getList().indexOf(listRequest.getTarget());
        response.setTargetIndex(targetIndex);
        response.setTarget(listRequest.getTarget());
        response.setOperations(-1);

        return  response;
    }
}
