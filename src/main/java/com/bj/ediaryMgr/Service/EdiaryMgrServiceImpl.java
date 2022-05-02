package com.bj.ediaryMgr.Service;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("ediaryMgrService")
public class EdiaryMgrServiceImpl implements EdiaryMgrService {
    @Override
    public List<String> getEdiaryHisDataList() {
        List<String> mList = new LinkedList<String>();
        mList.add("2020");
        System.out.println("2020");
        return mList;
    }
}
