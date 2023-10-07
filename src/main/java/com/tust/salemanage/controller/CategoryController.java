package com.tust.salemanage.controller;

import com.tust.salemanage.bean.Category;
import com.tust.salemanage.bean.CategorySales;
import com.tust.salemanage.bean.Product;
import com.tust.salemanage.bean.User;
import com.tust.salemanage.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @ResponseBody
    @RequestMapping("/getCategory")
    public List<Category> getCategoryName() {
        return categoryService.getCategoryName();
    }

    @ResponseBody
    @RequestMapping("/getAllProduct")
    public List<Product> getAllProduct() {
        return categoryService.getAllProduct();
    }

    @ResponseBody
    @RequestMapping("/getCategoryName")
    public List<Product> getCategoryNameById(@RequestBody Category category) {
        return categoryService.getProductById(category.getCategoryId());
    }

    @RequestMapping("/productInfo")
    public void productInfoPage(@RequestBody Map<String, Integer> requestBody, HttpSession session) {

        Integer productId = requestBody.get("productId");

        session.setAttribute("productId", productId);

    }

    @ResponseBody
    @RequestMapping("/getProductInfo")
    public Product getProductInfoById(@RequestBody Product product) {
        return categoryService.getProductInfoById(product.getProductId());
    }

    @ResponseBody
    @RequestMapping("/searchProduct")
    public List<Product> searchProduct(@RequestBody Product product) {
        return categoryService.searchProduct(product.getProductName());
    }

    @ResponseBody
    @RequestMapping("/getShopInfo")
    public List<Product> getShopInfo(@RequestBody User user) {
        return categoryService.getShopInfo(user);
    }

    @ResponseBody
    @RequestMapping("/insertProduct")
    public String insertProduct(@RequestBody Product product) {
        int res = categoryService.insertProduct(product);
        if (res == 1) {
            return "success";
        }
        return "fail";
    }

    @ResponseBody
    @RequestMapping("/categorySaleAnalyse")
    public List<CategorySales> categorySaleAnalyse() {
        return categoryService.categorySaleAnalyse();
    }


}
