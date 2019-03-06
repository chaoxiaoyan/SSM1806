package com.qfedu.service;

import com.qfedu.PageBean;
import com.qfedu.domain.McCaiPin;
import com.qfedu.vo.VCaidan;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface McCaiPinService {
    public List<McCaiPin> findAll();


    public List<McCaiPin> paihang(String state);

    public Map<String,Object> findByPage(Integer page);


    public PageBean<McCaiPin> findCaiPinByPage(Integer page);

    public List<McCaiPin> findOrder(HttpSession session);

    public Long findTotalPrice(HttpSession session);

    public VCaidan findById(Integer kId);
    //详情页面里边的热推菜方法
    public List<McCaiPin> retuicai();

}
