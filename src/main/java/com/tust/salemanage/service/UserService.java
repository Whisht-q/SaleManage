package com.tust.salemanage.service;

import com.tust.salemanage.bean.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getUser();

    int checkLogin(User user);

    int register(User user);

    int getUserIdByName(User user);

    int addShop(Collection collection);

    int isCollected(Collection collection);

    int addCommnet(Message message);

    int countCollected(Product product);

    List<Message> getComment(Product product);

    int removeFromShop(Collection collection);

    int purchase(GoodsOrder order);

    List<GoodsOrder> getAllOrder(User user);

    User getUserInfoById(User user);

    int updatePwd(User user);

    int checkUsername(User user);

    int insertManager(User user);

    String getUserRoleByName(User user);
}
