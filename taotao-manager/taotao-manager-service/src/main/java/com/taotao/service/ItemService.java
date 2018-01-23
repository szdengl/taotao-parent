package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbItem;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-15 23:34
 **/
public interface ItemService {
    TbItem getItemById(long itemId);
    EUDataGridResult getItemList(int page, int rows);
    TaotaoResult createItem(TbItem item,String desc,String itemParams) throws Exception;
}
