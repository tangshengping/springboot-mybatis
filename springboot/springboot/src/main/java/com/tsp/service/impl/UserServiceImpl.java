package com.tsp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tsp.bean.User;
import com.tsp.dao.UserDao;
import com.tsp.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource
	private UserDao userDao;
	
	@Override
	public User selectid(int id) {
		return userDao.selectid(id);
	}

	@Override
	public boolean insertUser(String name) {
		return userDao.insertUser(name);
	}

	@Override
	public List<Map> select(int id) {
		return userDao.select(id);
	}

	@Override
	public User selectUserById(int id) {
		return userDao.selectUserById(id);
	}

}
