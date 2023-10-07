package com.tust.salemanage.service.impl;

import com.tust.salemanage.bean.*;
import com.tust.salemanage.mapper.*;
import com.tust.salemanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    CollectionMapper collectionMapper;

    @Autowired
    MessageMapper messageMapper;

    @Autowired
    GoodsOrderMapper goodsOrderMapper;

    @Autowired
    ProductMapper productMapper;

    @Override
    public User getUser() {
        return userMapper.getUser();
    }

    @Override
    public int checkLogin(User user) {
        return userMapper.checkLogin(user);
    }

    @Override
    public int register(User user) {
        int i = userMapper.checkLogin(new User(user.getUsername()));
        if (i == 1) {
            return 0;
        }
        int res = userMapper.register(user);
        if (res == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public int getUserIdByName(User user) {
        return userMapper.getUserIdByName(user);
    }

    @Override
    public int addShop(Collection collection) {
        return collectionMapper.addShop(collection);
    }

    @Override
    public int isCollected(Collection collection) {
        return collectionMapper.isCollected(collection);
    }

    @Override
    public int addCommnet(Message message) {
        return messageMapper.addComment(message);
    }

    @Override
    public int countCollected(Product product) {
        return collectionMapper.countCollected(product);
    }

    @Override
    public List<Message> getComment(Product product) {
        List<Message> commentList = messageMapper.getComment(product);
        for (Message message : commentList) {
            message.setUsername(userMapper.getUsernameById(new User(message.getUserId())));
        }
        return commentList;
    }

    @Override
    public int removeFromShop(Collection collection) {
        return collectionMapper.removeFromShop(collection);
    }

    @Override
    public int purchase(GoodsOrder order) {
        Product product = productMapper.getProductInfoById(order.getProductId());
        GoodsOrder ins = new GoodsOrder(order.getUserId(), product.getProductId(), product.getProductDescription(), product.getPrice());
        return goodsOrderMapper.purchase(ins);
    }

    @Override
    public List<GoodsOrder> getAllOrder(User user) {
        return goodsOrderMapper.getAllOrder(user);
    }

    @Override
    public User getUserInfoById(User user) {
        return userMapper.getUserInfoById(user);
    }

    @Override
    public int updatePwd(User user) {
        return userMapper.updatePwd(user);
    }

    @Override
    public int checkUsername(User user) {
        return userMapper.checkUsername(user);
    }

    @Override
    public int insertManager(User user) {
        return userMapper.insertManager(user);
    }

    @Override
    public String getUserRoleByName(User user) {
        return userMapper.getUserRoleByName(user);
    }
}
