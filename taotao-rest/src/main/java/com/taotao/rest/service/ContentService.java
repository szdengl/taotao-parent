package com.taotao.rest.service;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbContent;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-19 12:23
 **/
public interface ContentService {
    List<TbContent> getContentList(long cid) throws Exception;
}
