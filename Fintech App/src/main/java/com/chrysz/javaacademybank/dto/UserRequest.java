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
public class UserRequest {

    @Schema(description = "User's first name", example = "Max")
    private String firstName;

    @Schema(description = "User's last name", example = "Low")
    private String lastName;

    @Schema(description = "User's other names", example = "Middle")
    private String otherName;

    @Schema(description = "User's gender", example = "Male")
    private String gender;

    @Schema(description = "User's residential address", example = "123 Main St, Springfield")
    private String address;

    @Schema(description = "User's state of origin", example = "California")
    private String stateOfOrigin;

    @Schema(description = "User's email address", example = "maxlow@gmail.com")
    private String email;

    @Schema(description = "User's password", example = "password123")
    private String password;

    @Schema(description = "User's phone number", example = "+1234567890")
    private String phoneNumber;

    @Schema(description = "User's alternative phone number", example = "+0987654321")
    private String alternativePhoneNumber;
}
