package com.hklee.firstranking.service.product;

import com.hklee.firstranking.domain.product.Product;
import com.hklee.firstranking.domain.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateProductService {

    private final ProductRepository productRepository;

    public ProductDto create(CreateProductDto dto) {
        Product product = dto.toProduct();

        productRepository.save(product);

        return ProductDto.of(product);
    }

}
