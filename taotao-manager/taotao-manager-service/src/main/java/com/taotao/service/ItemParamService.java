package com.taotao.service;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbItemParam;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-18 14:37
 **/
public interface ItemParamService {

    TaotaoResult getItemParamByCid(long cid);

    TaotaoResult insertItemParam(TbItemParam itemParam);


}
