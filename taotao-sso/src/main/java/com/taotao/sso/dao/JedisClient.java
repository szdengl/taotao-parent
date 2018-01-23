package com.taotao.sso.dao;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-22 19:40
 **/
public interface JedisClient {
    String get(String key);

    String set(String key, String value);

    String hget(String hkey, String key);

    long hset(String hkey, String key, String value);

    long incr(String key);

    long expire(String key, int second);

    long ttl(String key);

    long del(String key);

    long hdel(String hkey, String key);
}
