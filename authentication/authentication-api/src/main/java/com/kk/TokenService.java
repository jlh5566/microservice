package com.kk;

public interface TokenService {

    /**
     * 根据用户名生成token
     */
    String generateTokenByName(String userName);
}
