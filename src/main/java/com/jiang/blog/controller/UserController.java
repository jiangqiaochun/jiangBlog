package com.jiang.blog.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jiang.blog.entity.User;
import com.jiang.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/index")
    public String index(){
        return "admin/admin_index";
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin(User user,HttpServletRequest request){
        if(userService.toLogin(user.getUsername(),user.getPassword())!=null){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            //user.setAbout(userService.findAbout());
            return "admin/admin_index";
        }
        return "admin";

    }
    @RequestMapping(value = "/editAbout")
    public String getAbout(Model model,HttpServletRequest request){
        return "admin/editAbout.html";
    }
    @RequestMapping("/about")
    public ModelAndView findAbout(HttpServletRequest request, Map map){
        User user=(User)request.getSession().getAttribute("user");
        user.setAbout(userService.findAbout());
        System.out.println(user);
        if( null != user.getAbout() ){
            System.out.println("user about:"+userService.findAbout());
        }
       map.put("user",user);
        return new ModelAndView("admin/about1",map);
    }
}
