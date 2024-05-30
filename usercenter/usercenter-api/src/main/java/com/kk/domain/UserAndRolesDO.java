package com.kk.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_roles")
public class UserAndRolesDO {

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private int id;

    @TableField("user_id")
    private int userId;

    @TableField("role_id")
    private String roleId;

}
