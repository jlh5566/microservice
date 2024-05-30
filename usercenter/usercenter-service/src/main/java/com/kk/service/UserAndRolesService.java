package com.kk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.domain.UserAndRolesDO;

import java.util.List;

/**
 * 用户查询接口
 */
public interface UserAndRolesService extends IService<UserAndRolesDO> {

    /**
     * 根据用户id查询关联的角色
     */
    List<UserAndRolesDO> getUserAndRolesByUserId(Integer userId);

}
