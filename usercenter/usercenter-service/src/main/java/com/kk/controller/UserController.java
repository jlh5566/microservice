package com.kk.controller;


import com.kk.RedisService;
import com.kk.TokenService;
import com.kk.constant.AuthConstant;
import com.kk.domain.UserDO;
import com.kk.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference(check = false)
    private TokenService tokenService;

    @Autowired
    private UserService userService;

    @DubboReference(check = false)
    private RedisService redisService;


    @PostMapping("/login")
    public String login(@RequestBody UserDO userDO) {

        if (userDO != null) {

            String username = userDO.getUsername();
            if (!StringUtils.isEmpty(username)) {

                UserDO userInfoDO = userService.getUserByUsername(username);

                if (userInfoDO != null) {

                    String token = tokenService.generateTokenByName(username);
                    redisService.setWithTime(AuthConstant.REDIS_TOKEN_HEAD + "_" + username, token, 2 * 60 * 60L);

                    return token;

                } else {
                    return "未查询到用户信息！";
                }

            }

        }

        return "";
    }


}
