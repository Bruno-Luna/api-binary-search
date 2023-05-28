package com.study.binarysearch.binarysearch.service;

import com.study.binarysearch.binarysearch.dto.NumberSearchRequestDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@ExtendWith(MockitoExtension.class)
@DisplayName("Testes do service de busca binária")
class NumberSearchServiceTest {

    @InjectMocks
    NumberSearchService service;

    @Test
    public void whenCallSearchBinaryPassingAnExistentValueOnListShouldReturnIndexCorrectly() {
        var numbersList = List.of(1, 2, 3, 4, 6, 7, 8);
        int target = 4;
        var dto = new NumberSearchRequestDTO(numbersList, target);

        var result = service.searchByBinary(dto);

        assertThat(result.getTarget()).isEqualTo(4);
        assertThat(result.getTargetIndex()).isEqualTo(3);
        assertThat(result.getOperations()).isEqualTo(-1);
    }

    @Test
    public void whenCallSearchBinaryPassingAnNonexistentTargetShouldReturnTargetIndexEqualsMinus1() {
        var dto = new NumberSearchRequestDTO(List.of(1, 2, 3), 4);

        var result = service.searchByBinary(dto);

        assertThat(result.getTargetIndex()).isEqualTo(-1);
    }
}
