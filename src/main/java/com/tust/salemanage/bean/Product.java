package com.tust.salemanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private Integer productId;
    private String productName;
    private BigDecimal price;
    private Integer categoryId;
    private String productDescription;

    public Product(Integer productId) {
        this.productId = productId;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(String productName, BigDecimal price, Integer categoryId, String productDescription) {
        this.productName = productName;
        this.price = price;
        this.categoryId = categoryId;
        this.productDescription = productDescription;
    }
}
