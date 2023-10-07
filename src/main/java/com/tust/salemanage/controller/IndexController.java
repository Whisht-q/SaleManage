package com.tust.salemanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/register")
    public String registerPage() {
        return "register";
    }

    @RequestMapping("/index")
    public String indexPage() {
        return "index";
    }


    @RequestMapping("/toProductInfo")
    public String toProductInfo() {
        return "productInfo";
    }

    @RequestMapping("/shopping")
    public String shoppingPage() {
        return "shopping";
    }

    @RequestMapping("/orderInfo")
    public String orderInfoPafe() {
        return "orderInfo";
    }

    @RequestMapping("/userInfo")
    public String userInfoPage() {
        return "userInfo";
    }

    @RequestMapping("/manage")
    public String managePage() {
        return "manage";
    }

    @RequestMapping("/managerRegister")
    public String managerRegister() {
        return "managerRegister";
    }

    @RequestMapping("/saleAnalyse")
    public String saleAnalyse(){
        return "saleAnalyse";
    }
}
