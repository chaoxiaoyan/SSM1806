package com.qfedu.controller;

import com.qfedu.PageBean;
import com.qfedu.content.JsonBean;
import com.qfedu.domain.McCaiPin;
import com.qfedu.service.McCaiPinService;
import com.qfedu.util.JsonUtils;
import com.qfedu.vo.VCaidan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/caipin")
public class CaiPinController {
    
    @Autowired
    private McCaiPinService caiPinService;
    
    @RequestMapping("/list.do")
    public JsonBean findAll() {
        JsonBean bean = new JsonBean();
        try {
            List<McCaiPin> list = caiPinService.findAll();
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(1,e.getMessage());
        }
        return  bean;

    }
    @RequestMapping("/order.do")
    public JsonBean findOrder(HttpSession session) {
        JsonBean bean = new JsonBean();
        try {
            List<McCaiPin> list = caiPinService.findOrder(session);
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(1,e.getMessage());
        }
        return  bean;
    }

    @RequestMapping("/total.do")
    public JsonBean findTotalPrice(HttpSession session) {
        JsonBean bean = new JsonBean();
        try {
            Long totalPrice = caiPinService.findTotalPrice(session);
            System.out.println(totalPrice);
            bean = JsonUtils.createJsonBean(1,totalPrice);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return  bean;
    }

    @RequestMapping("/listPage.do")
    public JsonBean findByPage(Integer page) {
        JsonBean bean = new JsonBean();
        System.out.println(page + "page");
        if (page == null) {
            page = 1;
        }
        try {
            Map<String, Object> map = caiPinService.findByPage(page);
            bean = JsonUtils.createJsonBean(1,map);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }


    @RequestMapping("/listPage1.do")
    public JsonBean findByPage1(Integer page) {
        JsonBean bean = new JsonBean();
        if (page == null) {
            page = 1;
        } else {
            if (page <= 0) {
                page = 1;
            }
        }
        try {

            PageBean<McCaiPin> pageBean = caiPinService.findCaiPinByPage(page);
            bean = JsonUtils.createJsonBean(1,pageBean);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }




    @RequestMapping("/paihang.do")
    public JsonBean paihang(String state) {
        //System.out.println(state +"controller");
        JsonBean bean = new JsonBean();
        try {
            List<McCaiPin> list = caiPinService.paihang(state);
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return  bean;
    }

    @RequestMapping("/hot.do")
    public JsonBean hot(String state) {
        //System.out.println(state +"controller");
        JsonBean bean = new JsonBean();
        try {
            List<McCaiPin> list = caiPinService.paihang(state);
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return  bean;
    }@RequestMapping("/yizhouhot.do")
    public JsonBean yizhouremen(String state) {
        //System.out.println(state +"controller");
        JsonBean bean = new JsonBean();
        try {
            List<McCaiPin> list = caiPinService.paihang(state);
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return  bean;
    }
    @RequestMapping("/vcaidan.do")
    public JsonBean findVcaidan(Integer kId) {
        JsonBean bean = new JsonBean();

        try {
            VCaidan vCaidan = caiPinService.findById(kId);
            bean = JsonUtils.createJsonBean(1,vCaidan);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
    @RequestMapping("/retuicai.do")
    public JsonBean retuicai() {
        JsonBean bean = new JsonBean();
        try {
            List<McCaiPin> list = caiPinService.retuicai();
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
}
