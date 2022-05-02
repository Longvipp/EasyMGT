package com.bj.ediaryMgr.Service;

import java.util.List;

public interface EdiaryMgrService {
    /**
     * 获取用户提交的ediary日记数据文件
     * @return 历史数据
     */
    List<String> getEdiaryHisDataList();
}
