package com.nan.gmall_user.service.impl;

import com.nan.gmall_user.mapper.UserMapper;
import com.nan.gmall_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nan
 * @date 2020/10/2020/10/140:20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
}
