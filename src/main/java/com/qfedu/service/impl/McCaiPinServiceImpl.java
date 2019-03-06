package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.PageBean;
import com.qfedu.dao.McCaiPinMapper;
import com.qfedu.domain.McCaiPin;
import com.qfedu.domain.McOrder;
import com.qfedu.domain.McUser;
import com.qfedu.service.McCaiPinService;
import com.qfedu.vo.VCaidan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class McCaiPinServiceImpl implements McCaiPinService {


    @Autowired
    private McCaiPinMapper caiPinDao;

    @Override
    public List<McCaiPin> findAll() {

        return caiPinDao.findAll();
    }

    @Override
    public List<McCaiPin> paihang(String state) {

        return caiPinDao.paihang(state);
    }

    @Override
    public Map<String, Object> findByPage(Integer page) {

        Page<Object> startPage = PageHelper.startPage(page, 12);
        List<McCaiPin> list = caiPinDao.findAll();

        Map<String,Object> map = new HashMap<>();
        map.put("total",startPage.getTotal());
        map.put("rows",list);
        return map;
    }


    @Override
    public PageBean<McCaiPin> findCaiPinByPage(Integer page) {
        PageBean<McCaiPin> pageBean = new PageBean<>();
        
        int total = 0;

        int count = caiPinDao.count();
        if (count % pageBean.getPageSize() == 0) {
            total = count / pageBean.getPageSize();
        } else {
            total = count / pageBean.getPageSize() + 1;
        }

        pageBean.setTotalPage(total);
        pageBean.setCurrentPage(page);
        //计算分页使用的索引
        int index = (page - 1) * pageBean.getPageSize();
        //分页查询

        List<McCaiPin> list = caiPinDao.findByIndexAndSize(index, pageBean.getPageSize());

        pageBean.setPageInfos(list);


        return pageBean;
    }


    @Override
    public List<McCaiPin> findOrder(HttpSession session) {

        McUser user = (McUser) session.getAttribute("user");
        if (user == null) {
            throw new RuntimeException("您还未登录，请登录");
        }
        return caiPinDao.selectOrder(user.getuId());
    }

    @Override
    public Long findTotalPrice(HttpSession session) {

        McUser user = (McUser) session.getAttribute("user");
        if (user == null) {
            throw new RuntimeException("您还未登录，请登录");
        }
        //System.out.println(user.getuId() + "user.getuId()");
        List<McCaiPin> list = caiPinDao.selectOrder(user.getuId());
        long a = 0;
        for (int i = 0; i < list.size(); i++) {
            a += list.get(i).getkPrice();
        }
        return a;
    }

    @Override
    public VCaidan findById(Integer kId) {
        return caiPinDao.findById(kId);
    }

    @Override
    public List<McCaiPin> retuicai() {
        return caiPinDao.retuicai();
    }
}
