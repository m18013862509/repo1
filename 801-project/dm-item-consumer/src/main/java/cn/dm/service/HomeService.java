package cn.dm.service;

import cn.dm.vo.HotItemVo;

import java.util.List;

public interface HomeService {
    public List<HotItemVo> queryBanner() throws Exception;
}
