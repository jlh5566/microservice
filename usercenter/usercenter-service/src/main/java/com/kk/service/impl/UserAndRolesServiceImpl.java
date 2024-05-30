package com.kk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kk.dao.UserAndRolesMapper;
import com.kk.domain.UserAndRolesDO;
import com.kk.service.UserAndRolesService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserAndRolesServiceImpl extends ServiceImpl<UserAndRolesMapper, UserAndRolesDO> implements UserAndRolesService {


    @Override
    public List<UserAndRolesDO> getUserAndRolesByUserId(Integer userId) {

        return this.list(new LambdaQueryWrapper<UserAndRolesDO>().eq(UserAndRolesDO::getUserId, userId));
    }
}
