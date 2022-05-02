package com.bj.ediaryMgr.Service;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("ediaryMgrService")
public class EdiaryMgrServiceImpl implements EdiaryMgrService {
    @Override
    public List<String> getEdiaryHisDataList() {
        List<String> mList = new LinkedList<String>();
        mList.add("2022.05.02 21:34:20");
        mList.add("2022.05.02 21:34:21");
        mList.add("2022.05.02 21:34:22");
        mList.add("2022.05.02 21:34:23");
        mList.add("2022.05.02 21:34:24");
        mList.add("2022.05.02 21:34:25");
        mList.add("2022.05.02 21:34:26");
        System.out.println("2020");
        return mList;
    }
}
