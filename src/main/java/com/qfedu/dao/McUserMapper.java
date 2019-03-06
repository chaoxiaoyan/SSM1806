package com.qfedu.dao;

import com.qfedu.domain.McUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface McUserMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(McUser record);

    int insertSelective(McUser record);

    McUser selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(McUser record);

    int updateByPrimaryKey(McUser record);



    McUser selectByName(@Param("name") String name);


}