package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name",required = true,defaultValue = "b")String name, Model model){
       //将这个放在model 渲染给前端页面

        model.addAttribute("namea",name);
        return "hello";
    }
}
