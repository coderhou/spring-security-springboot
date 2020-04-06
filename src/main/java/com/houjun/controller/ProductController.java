package com.houjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/insert")
    public String add(){
        return "add";
    }
    @RequestMapping("/del")
    public String del(){
        return "add";
    }
    @RequestMapping("/look")
    public String look(){
        return "add";
    }
    @RequestMapping("/update")
    public String update(){
        return "add";
    }
}
