package com.kk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kk.dao.UserMapper;
import com.kk.domain.RolesDO;
import com.kk.domain.UserAndRolesDO;
import com.kk.domain.UserDO;
import com.kk.service.RolesService;
import com.kk.service.UserAndRolesService;
import com.kk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Autowired
    private UserAndRolesService userAndRolesService;

    @Autowired
    private RolesService rolesService;


    @Override
    public UserDO getUserByUsername(String username) {

        UserDO userDO = this.getOne(new LambdaQueryWrapper<UserDO>().eq(UserDO::getUsername, username));

        if (userDO != null) {

            List<UserAndRolesDO> userAndRolesDOList = userAndRolesService.getUserAndRolesByUserId(userDO.getId());

            if (!CollectionUtils.isEmpty(userAndRolesDOList)) {


                List<RolesDO> rolesDOList = rolesService.list(new LambdaQueryWrapper<RolesDO>().in(RolesDO::getId, userAndRolesDOList.stream().map(UserAndRolesDO::getRoleId).collect(Collectors.toList())));
                userDO.setRolesDOList(rolesDOList);

            }

        }

        return userDO;
    }


}
