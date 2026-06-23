package com.ecommerce.simple_ecommerce_store.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(description = "Product information")
public class ProductDTO {
    
    @Schema(description = "Product ID", example = "1")
    private Long id;
    
    @NotBlank(message = "Product name is required")
    @Size(min = 1, max = 255, message = "Product name must be between 1 and 255 characters")
    @Schema(description = "Product name", example = "iPhone 15")
    private String name;
    
    @Size(max = 500, message = "Description must not exceed 500 characters")
    @Schema(description = "Product description", example = "Latest iPhone model with advanced features")
    private String description;
    
    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    @Schema(description = "Product price", example = "999.99")
    private Double price;
    
    @NotNull(message = "Stock quantity is required")
    @Min(value = 0, message = "Stock quantity cannot be negative")
    @Schema(description = "Available stock quantity", example = "50")
    private Integer stock;
    
    @NotBlank(message = "Category is required")
    @Size(min = 1, max = 100, message = "Category must be between 1 and 100 characters")
    @Schema(description = "Product category", example = "Electronics")
    private String category;
    
    @Schema(description = "Product image URL", example = "http://example.com/image.jpg")
    private String imageUrl;
}