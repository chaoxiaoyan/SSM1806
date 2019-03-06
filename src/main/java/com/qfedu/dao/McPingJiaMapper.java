package com.qfedu.dao;

import com.qfedu.domain.McPingJia;
import com.qfedu.vo.VPingjia;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface McPingJiaMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(McPingJia record);

    int insertSelective(McPingJia record);

    McPingJia selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(McPingJia record);

    int updateByPrimaryKey(McPingJia record);

    List<VPingjia> findBypKId(@Param("pKId") Integer pKId);

    List<VPingjia> findBypKIdAndState(@Param("pKId") Integer pKId,@Param("state")String state );
}