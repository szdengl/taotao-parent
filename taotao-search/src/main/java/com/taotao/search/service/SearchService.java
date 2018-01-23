package com.taotao.search.service;

import com.taotao.search.pojo.SearchResult;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-22 23:49
 **/
public interface SearchService {
    SearchResult search(String queryString, int page, int rows) throws Exception;
}
