package com.hklee.firstranking.controller.product;

import com.hklee.firstranking.service.product.ProductDto;
import com.hklee.firstranking.service.product.CreateProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/product")
@RestController
public class ProductController {

    private final CreateProductService createProductService;

    @PostMapping
    public ProductDto create(@RequestBody CreateProductRequest createRequest) {
        return createProductService.create(createRequest.toServiceDto());
    }

}
