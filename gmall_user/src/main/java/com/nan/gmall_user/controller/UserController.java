package com.nan.gmall_user.controller;

import com.nan.gmall_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author nan
 * @date 2020/10/2020/10/140:15
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello index";
    }


}
