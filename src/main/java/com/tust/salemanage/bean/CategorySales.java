package com.tust.salemanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategorySales {
    private int categoryId;
    private String categoryName;
    private double totalSales;
}
