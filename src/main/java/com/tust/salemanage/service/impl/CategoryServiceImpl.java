package com.tust.salemanage.service.impl;

import com.tust.salemanage.bean.*;
import com.tust.salemanage.mapper.CategoryMapper;
import com.tust.salemanage.mapper.CollectionMapper;
import com.tust.salemanage.mapper.ProductMapper;
import com.tust.salemanage.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    ProductMapper productMapper;


    @Override
    public List<Category> getCategoryName() {
        return categoryMapper.getCategoryName();
    }

    @Override
    public List<Product> getAllProduct() {
        return productMapper.getAllProduct();
    }

    @Override
    public List<Product> getProductById(Integer categoryId) {
        return productMapper.getProductById(categoryId);
    }

    @Override
    public Product getProductInfoById(Integer productId) {
        return productMapper.getProductInfoById(productId);
    }

    @Override
    public List<Product> searchProduct(String keyword) {
        return productMapper.searchProduct("%" + keyword + "%");
    }

    @Override
    public List<Product> getShopInfo(User user) {
        return productMapper.getShopInfo(user);
    }

    @Override
    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }

    @Override
    public List<CategorySales> categorySaleAnalyse() {
        return categoryMapper.categorySaleAnalyse();
    }
}
