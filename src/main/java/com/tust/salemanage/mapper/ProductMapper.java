package com.tust.salemanage.mapper;

import com.tust.salemanage.bean.Product;
import com.tust.salemanage.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> getAllProduct();

    List<Product> getProductById(@Param("categoryId")Integer categoryId);

    Product getProductInfoById(@Param("productId")Integer productId);

    List<Product> searchProduct(@Param("keyword")String keyword);

    List<Product> getShopInfo(User user);

    int getInsertNum();

    int insertProduct(Product product);
}
