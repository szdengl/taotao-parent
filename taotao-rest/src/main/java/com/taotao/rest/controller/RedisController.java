package com.taotao.rest.controller;

import com.taotao.common.util.TaotaoResult;
import com.taotao.rest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-22 20:37
 **/
@Controller
@RequestMapping("/cache/sync")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/content/{contentCid}")
    public TaotaoResult contentCacheSync(@PathVariable Long contentCid) {
        TaotaoResult result = redisService.syncContent(contentCid);
        return result;
    }

}
