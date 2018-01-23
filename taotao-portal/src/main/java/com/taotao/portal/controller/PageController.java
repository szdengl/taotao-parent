package com.taotao.portal.controller;

import com.taotao.portal.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-19 13:39
 **/
@RequestMapping("/page")
public class PageController {
    @Autowired
    private AdService adService;

    @RequestMapping("/index")
    public String showIndex(Model model) throws Exception {
        String adResult = adService.getAdItemList();
        model.addAttribute("ad1", adResult);
        return "index";
    }

    @RequestMapping("/register")
    public String showRegister() {
        return "register";
    }
}
