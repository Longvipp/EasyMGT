package com.bj.cuser.service;

import com.bj.cuser.entity.CUser;

import java.util.List;
/**
 * Created by zhongzhaolong on 20181014.
 */
public interface CUserService {
    //查找所有内容
    public List<CUser> findall();
    public List<CUser> getUserInfoById(String id);
}

