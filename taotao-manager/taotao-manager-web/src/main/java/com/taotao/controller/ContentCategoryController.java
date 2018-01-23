package com.taotao.controller;

import com.taotao.common.pojo.TreeNode;
import com.taotao.common.util.TaotaoResult;
import com.taotao.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-19 11:59
 **/
@Controller
public class ContentCategoryController {
    @Autowired
    private ContentCategoryService contentCategoryService;

    @RequestMapping("/list")
    @ResponseBody
    public List<TreeNode> getContentCategoryList(@RequestParam(value="id", defaultValue="0")long parentid) throws Exception {
        List<TreeNode> list = contentCategoryService.getContentCategoryList(parentid);
        return list;
    }

    @RequestMapping("/create")
    @ResponseBody
    public TaotaoResult addNode(Long parentId, String name) throws Exception {

        TaotaoResult result = contentCategoryService.addNode(parentId, name);

        return result;
    }
}
