package com.taotao.rest.service;

import com.taotao.common.util.TaotaoResult;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-22 20:32
 **/
public interface RedisService {
    TaotaoResult syncContent(long contentCid);
}
