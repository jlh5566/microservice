package com.kk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.domain.UserDO;

/**
 * 用户查询接口
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名称查询唯一用户
     *
     * @param username 用户名称
     * @return UserEntity
     */
    UserDO getUserByUsername(String username);


}
