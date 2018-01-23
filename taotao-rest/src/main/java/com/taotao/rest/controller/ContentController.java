package com.taotao.rest.controller;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbContent;
import com.taotao.rest.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-19 12:24
 **/
@Controller
@RequestMapping("/content")
public class ContentController {


        @Autowired
        private ContentService contentService;

        @RequestMapping("/category/{cid}")
        @ResponseBody
        public TaotaoResult getContentList(@PathVariable Long cid) {
            List<TbContent> list = null;
            try {
                list = contentService.getContentList(cid);
            } catch (Exception e) {
                e.printStackTrace();
                return TaotaoResult.build(500, e.getMessage());
            }
            return TaotaoResult.ok(list);
        }


}
