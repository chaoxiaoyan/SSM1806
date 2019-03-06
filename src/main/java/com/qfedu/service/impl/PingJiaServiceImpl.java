package com.qfedu.service.impl;

import com.qfedu.dao.McPingJiaMapper;
import com.qfedu.service.PingJiaService;
import com.qfedu.vo.VPingjia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PingJiaServiceImpl implements PingJiaService {


    @Autowired
    private McPingJiaMapper pingJiaDao;
    @Override
    public List<VPingjia> findByIb(Integer id) {
        return pingJiaDao.findBypKId(id);
    }

    @Override
    public List<VPingjia> findBypKIdAndState(Integer id, String state) {
        return pingJiaDao.findBypKIdAndState(id,state);
    }
}
