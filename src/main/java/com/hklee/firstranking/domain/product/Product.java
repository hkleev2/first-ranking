package com.hklee.firstranking.domain.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {
    // DB와 매핑된 객체
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String brand;

    @Column
    private String company;

}
