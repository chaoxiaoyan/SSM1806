package com.qfedu.dao;

import com.qfedu.domain.McCaiPin;
import com.qfedu.vo.VCaidan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface McCaiPinMapper {
    int deleteByPrimaryKey(Integer kId);

    int insert(McCaiPin record);

    int insertSelective(McCaiPin record);

    McCaiPin selectByPrimaryKey(Integer kId);

    int updateByPrimaryKeySelective(McCaiPin record);

    int updateByPrimaryKey(McCaiPin record);

    List<McCaiPin> findAll();

    List<McCaiPin> paihang(@Param("state") String state);


    int count();

    List<McCaiPin> findByIndexAndSize(@Param("index") int index, @Param("size") int size);

    List<McCaiPin> selectOrder(@Param("oUId") Integer oUId);

    VCaidan findById(@Param("kId")Integer kId);
    //详情页面里边的热推菜
    List<McCaiPin> retuicai();
}