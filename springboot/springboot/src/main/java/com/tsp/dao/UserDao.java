package com.tsp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tsp.bean.User;

@Mapper
public interface UserDao {

    @Select("select * from user where id=#{id}")
    public User selectid(@Param("id") Integer id);

    @Insert("insert into user values(null,#{name})")
    public boolean insertUser(@Param("name") String name);

    @Select("select * from user u join user u1  where u.id=#{id}")
    public List<Map> select(@Param("id") Integer id);

    //XML自动注入
    User selectUserById(@Param("id") Integer id);

}