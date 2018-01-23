package com.taotao.service;

import com.taotao.common.util.EasyUIResult;
import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbContent;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-19 12:18
 **/
public interface ContentService {
    EasyUIResult getContentList(long catId, Integer page, Integer rows)  throws Exception ;

    TaotaoResult addContent(TbContent content) throws Exception;
}
