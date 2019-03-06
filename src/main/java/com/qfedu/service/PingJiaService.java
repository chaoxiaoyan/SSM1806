package com.qfedu.service;

import com.qfedu.vo.VPingjia;

import java.util.List;

public interface PingJiaService {

    public List<VPingjia> findByIb(Integer id);


    public List<VPingjia> findBypKIdAndState(Integer id,String state);
}
