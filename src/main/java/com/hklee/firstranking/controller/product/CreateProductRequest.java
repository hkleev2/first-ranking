package com.hklee.firstranking.controller.product;

import com.hklee.firstranking.service.product.CreateProductDto;

public class CreateProductRequest {
    private String name;
    private String brand;
    private String company;

    public CreateProductDto toServiceDto() {
        return CreateProductDto.builder()
                .name(name)
                .brand(brand)
                .company(company)
                .build();
    }
}
