package com.example.daxiongmao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.daxiongmao.domain.User;
import com.example.daxiongmao.service.UserService;
import com.example.daxiongmao.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 86186
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-04-09 23:04:54
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




