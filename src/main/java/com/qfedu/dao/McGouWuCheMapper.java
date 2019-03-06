package com.qfedu.dao;

import com.qfedu.domain.McGouWuChe;

public interface McGouWuCheMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(McGouWuChe record);

    int insertSelective(McGouWuChe record);

    McGouWuChe selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(McGouWuChe record);

    int updateByPrimaryKey(McGouWuChe record);
}