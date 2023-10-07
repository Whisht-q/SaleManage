package com.tust.salemanage.mapper;


import com.tust.salemanage.bean.GoodsOrder;
import com.tust.salemanage.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsOrderMapper {

    int purchase(GoodsOrder order);

    List<GoodsOrder> getAllOrder(User user);
}
