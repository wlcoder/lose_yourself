package com.wl.loseyourself.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wl
 * @since 2020-04-26
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}

