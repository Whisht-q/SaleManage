package com.tust.salemanage.controller;

import com.tust.salemanage.bean.*;
import com.tust.salemanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/checkLogin")
    public String checkLogin(@RequestBody User user, HttpSession session) {
        int res = userService.checkLogin(user);
        if (res == 1) {
            session.removeAttribute("message");
            session.setAttribute("username", user.getUsername());
            session.setAttribute("userId", userService.getUserIdByName(user));
            String role = userService.getUserRoleByName(new User(user.getUsername()));
            return role;
        }
        return "false";
    }

    @ResponseBody
    @RequestMapping("/registerUser")
    public String registerUser(@RequestBody User user) {
        int res = userService.register(user);
        if (res == 0) {
            return "repeat";
        } else if (res == 1) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @ResponseBody
    @RequestMapping("/addShop")
    public String addShop(@RequestBody Collection collection) {
        int i = userService.addShop(collection);
        if (i == 1) {
            return "success";
        }
        return "false";
    }

    @ResponseBody
    @RequestMapping("/isCollected")
    public String isCollected(@RequestBody Collection collection) {
        int res = userService.isCollected(collection);
        if (res == 1) {
            return "active";
        }
        return "none";
    }

    @ResponseBody
    @RequestMapping("/addComment")
    public String addComment(@RequestBody Message message) {
        int res = userService.addCommnet(message);
        if (res == 1) {
            return "success";
        }
        return "fail";
    }

    @ResponseBody
    @RequestMapping("/countCollected")
    public int countCollected(@RequestBody Product product) {
        return userService.countCollected(product);
    }

    @ResponseBody
    @RequestMapping("/getComment")
    public List<Message> getComment(@RequestBody Product product) {
        List<Message> res = userService.getComment(product);
        return res;
    }

    @ResponseBody
    @RequestMapping("/removeFromShop")
    public String removeFromShop(@RequestBody Collection collection) {
        int res = userService.removeFromShop(collection);
        if (res == 1) {
            return "success";
        }
        return "fail";
    }

    @ResponseBody
    @RequestMapping("/purchase")
    public String purchase(@RequestBody GoodsOrder goodsOrder) {
        int res = userService.purchase(goodsOrder);
        if (res == 1) {
            return "success";
        }
        return "fail";
    }

    @ResponseBody
    @RequestMapping("/getAllOrder")
    public List<GoodsOrder> getAllOrder(@RequestBody User user) {
        return userService.getAllOrder(user);
    }

    @ResponseBody
    @RequestMapping("/getUserInfoById")
    public User getUserInfoById(@RequestBody User user) {
        return userService.getUserInfoById(user);
    }

    @ResponseBody
    @RequestMapping("/updatePwd")
    public String updatePwd(@RequestBody User user){
        int res = userService.updatePwd(user);
        if (res == 1){
            return "success";
        }
        return "fail";
    }

    @ResponseBody
    @RequestMapping("/checkUsername")
    public String checkUsername(@RequestBody User user){
        int res = userService.checkUsername(user);
        if (res == 1){
            return "fail";
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping("/insertManager")
    public String insertManager(@RequestBody User user){
        int res = userService.insertManager(user);
        if (res == 1){
            return "success";
        }
        return "fail";
    }


}
