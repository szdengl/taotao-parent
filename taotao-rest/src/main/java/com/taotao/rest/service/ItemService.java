package com.taotao.rest.service;

import com.taotao.common.util.TaotaoResult;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-23 9:29
 **/
public interface ItemService {
    TaotaoResult getItemBaseInfo(long itemId);

    TaotaoResult getItemDesc(long itemId);

    TaotaoResult getItemParam(long itemId);
}
