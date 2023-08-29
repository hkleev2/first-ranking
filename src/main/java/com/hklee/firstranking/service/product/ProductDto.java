package com.hklee.firstranking.service.product;

import com.hklee.firstranking.domain.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ProductDto {

    private Long id;
    private String name;
    private String brand;
    private String company;

    public static ProductDto of(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .brand(product.getBrand())
                .company(product.getCompany())
                .build();
    }
}
