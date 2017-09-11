package com.tsp.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.bean.User;
import com.tsp.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
    @RequestMapping("test")
    public void test() {
    	
    	boolean insertUser = userService.insertUser("name1");
    	System.out.println(insertUser);
    	List<Map> select = userService.select(1);
    	System.out.println(select.get(0).get("name"));
    	User selectid = userService.selectid(1);
    	System.out.println(selectid.getName());
    	User selectUserById = userService.selectUserById(1);
    	System.out.println(selectUserById.getName());
    }

}
