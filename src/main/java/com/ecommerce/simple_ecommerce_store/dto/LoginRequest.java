package com.ecommerce.simple_ecommerce_store.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}