package com.tust.salemanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    private Integer messageId;
    private String username;
    private Integer userId;
    private Integer productId;
    private String messageComment;
    private Timestamp messageTime;

    public Message(Integer userId, String messageComment) {
        this.userId = userId;
        this.messageComment = messageComment;
    }

    public Message(Integer userId, Integer productId, String messageComment) {
        this.userId = userId;
        this.productId = productId;
        this.messageComment = messageComment;
    }

    public Message(Integer userId, Integer productId, String messageComment, Timestamp messageTime) {
        this.userId = userId;
        this.productId = productId;
        this.messageComment = messageComment;
        this.messageTime = messageTime;
    }
}
