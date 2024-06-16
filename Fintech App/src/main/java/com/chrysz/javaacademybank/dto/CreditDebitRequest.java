package com.chrysz.javaacademybank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDebitRequest {

    @Schema(description = "Account number to be credited or debited", example = "123456789")
    private String accountNumber;

    @Schema(description = "Amount to be credited or debited", example = "100.00")
    private BigDecimal amount;
}
