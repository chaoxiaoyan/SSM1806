package com.qfedu.controller;

import com.qfedu.content.JsonBean;
import com.qfedu.service.PingJiaService;
import com.qfedu.util.JsonUtils;
import com.qfedu.vo.VPingjia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pingjia")
public class PingJiaController {

    @Autowired
    private PingJiaService pingJiaService;

    JsonBean bean = new JsonBean();


    @RequestMapping("/pingjia.do")
    public JsonBean findByPKid(Integer kId) {
        try {
            List<VPingjia> list = pingJiaService.findByIb(kId);
            bean = JsonUtils.createJsonBean(1,list);

        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
    @RequestMapping("/weidaozan.do")
    public JsonBean findByPKidAndstate(Integer kId,String state) {
        try {
            List<VPingjia> list = pingJiaService.findBypKIdAndState(kId,state);
            bean = JsonUtils.createJsonBean(1,list);

        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
}
