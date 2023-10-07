package com.tust.salemanage.mapper;

import com.tust.salemanage.bean.Message;
import com.tust.salemanage.bean.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

    int addComment(Message message);

    List<Message> getComment(Product product);

}
