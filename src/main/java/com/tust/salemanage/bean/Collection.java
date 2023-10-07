package com.tust.salemanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Collection {

    private Integer collectionId;
    private Integer userId;
    private Integer productId;

    public Collection(Integer userId, Integer productId) {
        this.userId = userId;
        this.productId = productId;
    }
}
