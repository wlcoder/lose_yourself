package com.wl.loseyourself.entity;

import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wl
 * @since 2020-04-26
 */
@Data
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 邮箱|登录帐号
     */
    private String email;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 最后登录时间
     */
    @TableField("last_login_time")
    private Date lastLoginTime;
    /**
     * 1:有效，0:禁止登录
     */
    private Integer status;
    /**
     * ip
     */
    private String ip;
    /**
     * 图像
     */
    private String image;

}
