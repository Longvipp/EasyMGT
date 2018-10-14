package com.bj.dao;
import com.bj.entity.Dept;
import java.util.List;
/**
 * Created by zhongzhaaolong on 20181014.
 */
public interface DeptDao {
    //查找所有内容
    public List<Dept> findAll();
}