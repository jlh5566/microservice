package com.kk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kk.domain.RolesDO;
import com.kk.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolesMapper extends BaseMapper<RolesDO> {
}
