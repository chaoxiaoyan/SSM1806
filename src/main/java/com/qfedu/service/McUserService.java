package com.qfedu.service;

import com.qfedu.domain.McCaiPin;
import com.qfedu.domain.McUser;
import com.qfedu.vo.ResultVo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface McUserService {

    public McUser login(String name, String password);


    public void adduser(McUser user, String repassword);
}
