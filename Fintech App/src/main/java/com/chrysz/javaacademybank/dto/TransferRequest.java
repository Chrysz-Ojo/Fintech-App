package com.chrysz.javaacademybank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransferRequest {

    @Schema(description = "The account number from which the amount will be debited")
    private String sourceAccountNumber;

    @Schema(description = "The account number to which the amount will be credited")
    private String destinationAccountNumber;

    @Schema(description = "The amount to be transferred", example = "100.00")
    private BigDecimal amount;
}
