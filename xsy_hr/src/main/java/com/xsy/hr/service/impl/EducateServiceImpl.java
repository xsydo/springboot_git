package com.xsy.hr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xsy.hr.bean.Educate;
import com.xsy.hr.dao.IEducateDao;
import com.xsy.hr.service.IEducateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 10:21
 * @version:1.0
 **/
@Service
@Transactional
public class EducateServiceImpl extends ServiceImpl<IEducateDao, Educate> implements IEducateService {
}
