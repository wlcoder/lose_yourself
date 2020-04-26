package com.wl.loseyourself.enums;

import lombok.Getter;
/**
 *  @author: wl
 *  @Date: 2020/4/26 11:05
 *  @Description:通用枚举
 */
@Getter
public enum CommonEnum {
    FALSE(0),
    TRUE(1);

    private Integer value;

    CommonEnum(Integer value) {
        this.value = value;
    }

}
