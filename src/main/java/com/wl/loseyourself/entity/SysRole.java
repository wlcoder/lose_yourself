package com.wl.loseyourself.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wl
 * @since 2020-04-26
 */
@Data
@TableName("sys_role")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色类型
     */
    private String type;
    /**
     * 角色描述
     */
    private String description;
    /**
     * 是否启用
     */
    private String status;

}
