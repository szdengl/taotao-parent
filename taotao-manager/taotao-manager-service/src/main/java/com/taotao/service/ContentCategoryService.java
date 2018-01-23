package com.taotao.service;

import com.taotao.common.pojo.TreeNode;
import com.taotao.common.util.TaotaoResult;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-19 11:55
 **/
public interface ContentCategoryService {
    List<TreeNode> getContentCategoryList(long parentid) throws Exception;

    TaotaoResult addNode(long parentid, String name) throws Exception;
}
