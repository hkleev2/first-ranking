package com.hklee.firstranking.controller.product;

import com.hklee.firstranking.service.product.CreateProductDto;

public class CreateProductRequest {
    private String name;
    private String brand;
    private String company;

    // 사용자의 데이터 받을때
    public CreateProductDto toServiceDto() {
        return CreateProductDto.builder()
                .name(name)
                .brand(brand)
                .company(company)
                .build();
    }
}
