package com.chrysz.javaacademybank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailDetails {

    @Schema(description = "Recipients of the email", example = "example@example.com")
    private String recipients;

    @Schema(description = "Body of the email message", example = "This is the email body")
    private String messageBody;

    @Schema(description = "Subject of the email", example = "Email Subject")
    private String subjects;

    @Schema(description = "Attachment file path if any", example = "/path/to/attachment")
    private String attachment;
}
