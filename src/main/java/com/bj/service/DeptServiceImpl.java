package com.bj.service;

import com.bj.dao.DeptDao;
import com.bj.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhongzhaolong on 20181014.
 */

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    //注入dao对象
    @Autowired
    private DeptDao deptDao;
    public List<Dept> findall() {
        return deptDao.findAll();
    }
}