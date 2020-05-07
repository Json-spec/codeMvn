package com.webServer.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class UserController {
    @RequestMapping("index")
    public String toindex(){
        return "index";
    }
    @RequestMapping("login")
    public String tologin(){
        return "register";
    }
}
