package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-16 10:16
 **/
@Controller
public class IndexController {
    /**
     * 打开首页
     */
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }
    /**
     * 展示其他页面
     * <p>Title: showpage</p>
     * <p>Description: </p>
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page) {
        return page;
    }
}
