package com.bj.controller;

import com.bj.entity.Dept;
import com.bj.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wuming on 2017/9/8.
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/find")
    public String find(ModelMap model, HttpServletRequest request){
        List<Dept> deptList=deptService.findall();
        //将获取到的数据存入ModelMap中，以便页面取出
        model.addAttribute("depts", deptList);
        return "dept";
    }
}
