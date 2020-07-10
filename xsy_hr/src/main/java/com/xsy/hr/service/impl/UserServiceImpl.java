package com.xsy.hr.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xsy.hr.bean.User;
import com.xsy.hr.dao.IUserDao;
import com.xsy.hr.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 10:21
 * @version:1.0
 **/
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<IUserDao, User> implements IUserService  {
}
