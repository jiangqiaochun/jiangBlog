package com.jiang.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
    @RequestMapping(value = "/jiang",produces = "text/plain;charset=UTF-8")//项目访问URL
    public String index(){
        return "index.html";
    }
    @RequestMapping(value = "admin")
    public String getAdmin(){
        return "admin/login.html";
    }
}
