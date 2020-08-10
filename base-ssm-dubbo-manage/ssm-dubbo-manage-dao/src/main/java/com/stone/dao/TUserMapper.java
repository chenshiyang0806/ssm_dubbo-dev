package com.stone.dao;

import com.stone.pojo.TUser;
import com.stone.pojo.TUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {
    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(@Param("id") Integer id);

    int updateByExampleSelective(@Param("record") TUser record,@Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record,@Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}