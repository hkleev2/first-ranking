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

    //사용자의 요청 데이터를 서비스로 받는 객체
    public Product toProduct() {
        return Product.builder()
                .name(name)
                .brand(brand)
                .company(company)
                .build();
    }
}
