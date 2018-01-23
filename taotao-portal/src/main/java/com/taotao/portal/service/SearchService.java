package com.taotao.portal.service;

import com.taotao.portal.pojo.SearchResult;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-23 0:05
 **/
public interface SearchService {
    SearchResult search(String queryString, int page);
}
