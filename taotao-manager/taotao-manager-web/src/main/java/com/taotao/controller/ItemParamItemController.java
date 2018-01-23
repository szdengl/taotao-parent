package com.taotao.controller;

import com.taotao.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-18 16:31
 **/
@Controller
public class ItemParamItemController {
    @Autowired
    private ItemParamItemService itemParamItemService;

    @RequestMapping("/item/{itemId}")
    public String showItemParam(@PathVariable Long itemId, Model model) {
        String string = itemParamItemService.getItemParamByItemId(itemId);
        model.addAttribute("itemParam", string);
        return "item";
    }
}
