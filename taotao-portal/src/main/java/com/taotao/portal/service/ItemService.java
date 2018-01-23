package com.taotao.portal.service;

import com.taotao.pojo.TbItem;
import com.taotao.portal.pojo.Item;
import com.taotao.portal.pojo.ItemInfo;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-23 9:44
 **/
public interface ItemService {
    ItemInfo getItemById(Long itemId);
    String getItemDescById(Long itemId);
    String getItemParam(Long itemId);

}
