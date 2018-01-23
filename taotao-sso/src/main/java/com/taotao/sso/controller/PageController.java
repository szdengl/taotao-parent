package com.taotao.sso.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-23 10:46
 **/
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/register")
    public String showRegister() {
        return "register";
    }

    @RequestMapping("/login")
    public String showLogin(String redicect, Model model) {
        model.addAttribute("redicect", redicect);
        return "login";
    }
}
