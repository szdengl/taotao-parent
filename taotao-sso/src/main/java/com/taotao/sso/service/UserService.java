package com.taotao.sso.service;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbUser;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-23 10:16
 **/
public interface UserService {
    TaotaoResult checkData(String content, Integer type);

    TaotaoResult createUser(TbUser user);

    TaotaoResult userLogin(String username, String password);

    TaotaoResult getUserByToken(String token);

}
