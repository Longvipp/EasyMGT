package com.bj.ediaryMgr.controller;

import com.bj.ediaryMgr.Service.EdiaryMgrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhongzhaolong on 2022/05/02.
 */
@Controller
@RequestMapping("/ediary_mgr")
public class EdiaryMgrController {
    @Autowired
    private EdiaryMgrService ediaryMgr;
    @RequestMapping("/get_ediary_history_data")
    @ResponseBody public List<String> getEdiaryHisDataList(HttpServletRequest request, HttpServletResponse response) {
        return ediaryMgr.getEdiaryHisDataList();
    }
}
