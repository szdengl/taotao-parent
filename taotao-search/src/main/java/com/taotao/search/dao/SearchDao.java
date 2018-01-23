package com.taotao.search.dao;

import com.taotao.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-22 23:47
 **/
public interface SearchDao {
    SearchResult search(SolrQuery query) throws Exception;
}
