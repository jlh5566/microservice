package com.kk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kk.domain.UserAndRolesDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAndRolesMapper extends BaseMapper<UserAndRolesDO> {
}
