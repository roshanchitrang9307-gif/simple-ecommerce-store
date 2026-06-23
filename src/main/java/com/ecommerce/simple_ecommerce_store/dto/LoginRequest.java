package com.ecommerce.simple_ecommerce_store.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Schema(description = "User login request")
public class LoginRequest {
    
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Schema(description = "User's email address", example = "john@example.com")
    private String email;
    
    @NotBlank(message = "Password is required")
    @Schema(description = "User's password", example = "SecurePass@123")
    private String password;
}