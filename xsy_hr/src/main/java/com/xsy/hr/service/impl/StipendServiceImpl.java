package com.xsy.hr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xsy.hr.bean.Stipend;
import com.xsy.hr.dao.IStipendDao;
import com.xsy.hr.service.IStipendService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 10:21
 * @version:1.0
 **/
@Service
@Transactional
public class StipendServiceImpl extends ServiceImpl<IStipendDao, Stipend> implements IStipendService  {
}
