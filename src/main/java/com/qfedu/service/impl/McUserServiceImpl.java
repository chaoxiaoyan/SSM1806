package com.qfedu.service.impl;

import com.qfedu.dao.McUserMapper;
import com.qfedu.domain.McUser;
import com.qfedu.service.McUserService;
import com.qfedu.util.ResultUtil;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class McUserServiceImpl implements McUserService {

    @Autowired
    private McUserMapper userDao;
    @Override
    public McUser login(String name, String password) {
       McUser user = userDao.selectByName(name);

       if (user == null) {
           throw new RuntimeException("你还未登录，请登录");
       }
       if (!password.equals(user.getuPassword())) {
           throw new RuntimeException("密码错误，请重新登录");
       }
        return user;
    }

    @Override
    public void adduser(McUser user, String repassword) {


        McUser user1 = userDao.selectByName(user.getuName());
        //System.out.println(repassword + "再次验证");
       // System.out.println(user.getuPassword() + "password");
        if (!repassword.equals(user.getuPassword())) {
            throw new RuntimeException("您两次输入的密码不同，请重新输入");
        }
        if (user1 != null) {
            throw new RuntimeException("该用户已存在，请重新注册");
        }
        userDao.insertSelective(user);
    }
}
