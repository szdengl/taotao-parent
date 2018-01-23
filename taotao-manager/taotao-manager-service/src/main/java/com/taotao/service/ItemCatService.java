package com.taotao.service;

import com.taotao.common.pojo.TreeNode;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-16 11:29
 **/
public interface ItemCatService {
    List<TreeNode> getItemCatList(Long parentId);

}
