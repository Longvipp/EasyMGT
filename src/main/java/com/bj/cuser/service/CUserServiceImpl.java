package com.bj.cuser.service;

import com.bj.cuser.dao.CUserDao;
import com.bj.cuser.entity.CUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhongzhaolong on 20181014.
 */

@Service("cuserService")
public class CUserServiceImpl implements CUserService {
    //注入dao对象
    @Autowired
    private CUserDao userDao;
    public List<CUser> findall() {
        return userDao.findAll();
    }
}