package com.tust.salemanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GoodsOrder extends Product {
    private Integer orderId;
    private Integer userId;
    private Integer productId;
    private String productName;
    private Timestamp orderDate;
    private Date arrivalDate;
    private BigDecimal totalAmount;

    public GoodsOrder(Integer userId, Integer productId, String productName, BigDecimal totalAmount) {
        this.userId = userId;
        this.productId = productId;
        this.productName = productName;
        this.totalAmount = totalAmount;
    }

    public GoodsOrder(Integer userId, Integer productId) {
        this.userId = userId;
        this.productId = productId;
    }
}
