package com.taotao.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-18 19:10
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String showIndex(){
        return "index";
    }
}
