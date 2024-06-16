package com.chrysz.javaacademybank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankResponse {

    @Schema(description = "Response code indicating the result of the operation", example = "200")
    private String responseCode;

    @Schema(description = "Detailed message regarding the response", example = "Operation successful")
    private String responseMessage;

    @Schema(description = "Account information related to the response, if applicable")
    private AccountInfo accountInfo;
}
