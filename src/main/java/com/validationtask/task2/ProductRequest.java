package com.validationtask.task2;

import jakarta.validation.constraints.*;

public class ProductRequest {
    @NotBlank(message = "{E0001}")
    @Size(min = 2, max = 20, message = "{E0003}")
    private String productName;

    @NotBlank(message = "{E0001}")
    @ValidCategory
    private String category;

    @NotNull(message = "{E0002}")
    @Positive(message = "{E0004}")
    @Max(value = 1000000, message = "{E0005}")
    private Integer price;

    public ProductRequest(String productName, String category, Integer price) {
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public Integer getPrice() {
        return price;
    }
}