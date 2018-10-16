package com.bj.cuser.controller;

import com.alibaba.fastjson.JSONObject;
import com.bj.cuser.entity.CUser;
import com.bj.cuser.service.CUserService;
import org.mortbay.util.ajax.JSONObjectConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhongzhaolong on 2018/10/16.
 */
@Controller
@RequestMapping("/cuser")
public class CUserController {
    @Autowired
    private CUserService userService;
    @RequestMapping("/find")
    public String find(ModelMap model, HttpServletRequest request){
        List<CUser> userList=userService.findall();
        //将获取到的数据存入ModelMap中，以便页面取出
        model.addAttribute("users", userList);
        return "cuser";
    }
    @RequestMapping("/getUserInfo")
    @ResponseBody public List<CUser> getUserInfo(HttpServletRequest request, HttpServletResponse response){
        List<CUser> userList=userService.findall();
        //将获取到的数据存入ModelMap中，以便页面取出
        Map<String,Object> ret=new HashMap<String,Object>();
        ret.put("users",userList);
        return userList;
    }
}
