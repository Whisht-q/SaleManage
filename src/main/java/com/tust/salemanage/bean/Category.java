package com.tust.salemanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {

    private Integer categoryId;
    private String categoryName;

    public Category(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
