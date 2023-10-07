package com.tust.salemanage.service;

import com.tust.salemanage.bean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> getCategoryName();

    List<Product> getAllProduct();

    List<Product> getProductById(Integer categoryId);

    Product getProductInfoById(Integer productId);

    List<Product> searchProduct(String keyword);

    List<Product> getShopInfo(User user);

    int insertProduct(Product product);

    List<CategorySales> categorySaleAnalyse();

}
