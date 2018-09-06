package com.jiang.blog.controller;

import com.jiang.blog.entity.User;
import com.jiang.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class IndexController {
    @Resource
    private UserService userService;
    @RequestMapping("/about")
        public ModelAndView findAbout(HttpServletRequest request, Map map){
        map.put("about",userService.findAbout());
        return new ModelAndView("about",map);
    }
}
