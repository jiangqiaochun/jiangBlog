package com.jiang.blog.controller;

import com.jiang.blog.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class ArticleController {
    @Resource
    private UserService userService;
    @PostMapping(value = "/edit")
    public String editAbout(HttpServletRequest request){
        String parameter = request.getParameter("content");
        System.out.println("edit-md: " + parameter);
        boolean flag = userService.saveAbout(parameter);
        if( flag ) {
            return "success";
        }else {
            return "fail";
        }
    }
}
