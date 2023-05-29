package com.study.binarysearch.binarysearch.controller;

import com.study.binarysearch.binarysearch.dto.NumberSearchRequestDTO;
import com.study.binarysearch.binarysearch.service.NumberSearchService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@DisplayName("Testes do controller de NumberSearch")
public class NumberSearchControllerTest {
    @InjectMocks
    private NumberSearchController controller;

    @Mock
    private NumberSearchService service;

    @Test
    public void givenAnCorrectRequestOnTheFindIndexByBinaryRouteShouldReturnResponseCorrectly() {
        var numbersList = List.of(1, 2, 3, 4, 6, 7, 8);
        var targetNumber = 3;
        var requestDTO = NumberSearchRequestDTO
                .builder()
                .numbers(numbersList)
                .target(targetNumber)
                .build();

        controller.findIndexByBinary(requestDTO);

        // verificar se o nosso método foi chamado
        verify(service, only()).searchByBinary(requestDTO);
    }
}
