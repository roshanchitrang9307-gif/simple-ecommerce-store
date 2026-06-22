package com.ecommerce.simple_ecommerce_store.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.simple_ecommerce_store.dto.AuthResponse;
import com.ecommerce.simple_ecommerce_store.dto.LoginRequest;
import com.ecommerce.simple_ecommerce_store.dto.RegisterRequest;
import com.ecommerce.simple_ecommerce_store.entity.User;
import com.ecommerce.simple_ecommerce_store.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest request) {

        System.out.println("REGISTER API HIT ❗");

        return ResponseEntity.ok(userService.registerUser(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(new AuthResponse("token-here", request.getEmail(), "ROLE_USER"));
    }
}