package com.qfedu.dao;

import com.qfedu.domain.McOrder;
import org.apache.ibatis.annotations.Param;

public interface McOrderMapper {
    int deleteByPrimaryKey(Integer oId);

    int insert(McOrder record);

    int insertSelective(McOrder record);

    McOrder selectByPrimaryKey(Integer oId);

    int updateByPrimaryKeySelective(McOrder record);

    int updateByPrimaryKey(McOrder record);

    McOrder findByUidAndKid(@Param("uId") Integer uId, @Param("kId") Integer kId);

    void deleteByUidAndKid(@Param("uId") Integer uId, @Param("kId") Integer kId);
}