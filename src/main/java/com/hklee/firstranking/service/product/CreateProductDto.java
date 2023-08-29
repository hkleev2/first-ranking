package com.hklee.firstranking.service.product;

import com.hklee.firstranking.domain.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CreateProductDto {
    private String name;
    private String brand;
    private String company;

    public Product toProduct() {
        return Product.builder()
                .name(name)
                .brand(brand)
                .company(company)
                .build();
    }
}
