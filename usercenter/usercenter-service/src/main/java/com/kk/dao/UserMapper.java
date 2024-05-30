package com.kk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kk.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
