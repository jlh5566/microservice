package com.kk.constant;

public class AuthConstant {

    /**
     * 生成token
     */
    public static String secret = "m1z4N52+w7839rse9ebCC1DEHIHiwq3SXBpyjPLGEHQ=";
    public static long expiration = 60 * 60 * 24 * 7;

    /**
     * 保存token到redis的key
     */
    public static final String REDIS_TOKEN_HEAD = "microservice-token";


}
