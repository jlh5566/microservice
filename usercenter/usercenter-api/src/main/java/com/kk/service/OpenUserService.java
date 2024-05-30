package com.kk.service;

import com.kk.domain.UserDO;

public interface OpenUserService {

    /**
     * 根据用户名称查询唯一用户
     *
     * @param username 用户名称
     * @return UserEntity
     */
    UserDO getUserByUsername(String username);
}
