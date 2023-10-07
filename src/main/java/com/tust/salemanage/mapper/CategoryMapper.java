package com.tust.salemanage.mapper;

import com.tust.salemanage.bean.Category;
import com.tust.salemanage.bean.CategorySales;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> getCategoryName();

    List<CategorySales> categorySaleAnalyse();
}
