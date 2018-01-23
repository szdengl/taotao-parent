package com.taotao.controller;

import com.taotao.common.pojo.TreeNode;
import com.taotao.service.ItemCatService;
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
 * @create 2018-01-16 11:32
 **/
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @RequestMapping("/list")
    @ResponseBody
    //如果id为null是使用默认值，也就是parentid为0的分类列表
    public List<TreeNode> categoryList(@RequestParam(value="id", defaultValue="0") Long parentId) throws Exception {
        //查询数据库
        List<TreeNode> list = itemCatService.getItemCatList(parentId);
        return list;
    }
}
