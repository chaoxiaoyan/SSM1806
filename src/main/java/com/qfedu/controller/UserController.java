package com.qfedu.controller;

import com.qfedu.content.JsonBean;
import com.qfedu.domain.McUser;
import com.qfedu.service.McUserService;
import com.qfedu.util.JsonUtils;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.xml.ws.Service;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private McUserService userService;

    @RequestMapping("/login.do")
    public JsonBean login(String name, String password, HttpSession session) {
        //System.out.println(name);
        JsonBean bean = new JsonBean();
        try {
            McUser user = userService.login(name, password);
            session.setAttribute("user", user);
            bean = JsonUtils.createJsonBean(1,user);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/adduser.do")
    public JsonBean addUser(McUser user, String repassword) {
        JsonBean bean = new JsonBean();
        //System.out.println(user.getuName() + "user");
        try {
                userService.adduser(user,repassword);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/login1.do")
    public JsonBean login1(HttpSession session) {
        //System.out.println(name);
        JsonBean bean = new JsonBean();
        try {
            McUser user = (McUser)session.getAttribute("user");
            bean = JsonUtils.createJsonBean(1,user);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/loginout.do")
    public JsonBean loginOut(HttpSession session) {
        JsonBean bean = new JsonBean();
        try {
            session.invalidate();

            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return  bean;
    }
}
