package com.jiang.blog.entity;

import lombok.Data;

@Data
public class User {
    String username;
    String password;
    String about;
   /* public String toString(){
        return "user{username="+username+
                ",about="+about + '\'' +
                '}';
    }*/
}
