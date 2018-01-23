package com.taotao.sso.service;

import com.taotao.common.util.TaotaoResult;
import com.taotao.pojo.TbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-23 10:16
 **/
public interface UserService {
    TaotaoResult checkData(String content, Integer type);

    TaotaoResult createUser(TbUser user);

    TaotaoResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);

    TaotaoResult getUserByToken(String token);

}
