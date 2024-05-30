package com.kk.service.impl.open;


import com.kk.domain.UserDO;
import com.kk.service.OpenUserService;
import com.kk.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class OpenUserServiceImpl implements OpenUserService {

    @Autowired
    private UserService userService;

    @Override
    public UserDO getUserByUsername(String username) {

        return userService.getUserByUsername(username);
    }


}
