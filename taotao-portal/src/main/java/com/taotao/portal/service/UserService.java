package com.taotao.portal.service;

import com.taotao.pojo.TbUser;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-23 11:01
 **/
public interface UserService {
    TbUser getUserByToken(String token);
}
