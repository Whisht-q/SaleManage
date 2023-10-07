package com.tust.salemanage.mapper;

import com.tust.salemanage.bean.Collection;
import com.tust.salemanage.bean.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectionMapper {

    int addShop(Collection collection);

    int isCollected(Collection collection);

    int countCollected(Product product);

    int removeFromShop(Collection collection);

}
