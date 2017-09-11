package com.tsp.service;

import java.util.List;
import java.util.Map;

import com.tsp.bean.User;

public interface IUserService {

    public User selectid(int id);


    public boolean insertUser(String name);

    public List<Map> select(int id);

    public User selectUserById(int id);

}
