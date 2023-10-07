package com.tust.salemanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private Integer userId;
    private String username;
    private String password;
    private String email;
    private String role;

    public User(String username) {
        this.username = username;
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(Integer userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}
