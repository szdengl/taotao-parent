package com.taotao.controller;

import com.taotao.common.util.EasyUIResult;
import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbContent;
import com.taotao.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-19 12:20
 **/
@Controller
public class ContentController {
    @Autowired
    private ContentService contentService;

    @RequestMapping("/query/list")
    @ResponseBody
    public EasyUIResult getContentList(Long categoryId, Integer page, Integer rows) throws Exception {
        EasyUIResult result = contentService.getContentList(categoryId, page, rows);

        return result;

    }

    @RequestMapping("/save")
    @ResponseBody
    public TaotaoResult addContent(TbContent content) throws Exception {
        TaotaoResult result = contentService.addContent(content);
        return result;
    }
}
