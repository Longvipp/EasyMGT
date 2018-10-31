package com.bj.cuser.dao;
import com.bj.cuser.entity.CUser;
import java.util.List;
/**
 * Created by zhongzhaaolong on 20181014.
 */
public interface CUserDao {
    //查找所有内容
    List<CUser> findAll();
    List<CUser> findUserById(String id);
}