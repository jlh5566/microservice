package com.kk.service.impl.open;


import com.kk.TokenService;
import com.kk.utils.JWTUtil;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TokenServiceImpl implements TokenService {


    @Override
    public String generateTokenByName(String userName) {
        // 生成 Token
        return JWTUtil.generateToken(userName);
    }

}
