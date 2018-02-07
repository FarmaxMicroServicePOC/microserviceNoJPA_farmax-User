package com.bpm.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bpm.dao.inf.UserDao;
import com.google.gson.Gson;



@Service("userService")
public class UserServiceImpl implements UserServiceInf{

	@Autowired
	UserDao userDao;

	@Override
	public HashMap createUser(String userDetails){
		System.out.println("UserServiceImpl.createUser()");

        Gson gsonObj = new Gson();
        HashMap userDetailsMap = gsonObj.fromJson(userDetails, HashMap.class);
		System.out.println("\t cartMap : " + userDetailsMap.toString()); 

		HashMap userDetailsMapResponse = userDao.createUser(userDetailsMap);
		
		System.out.println("\t userDetailsMapResponse.size() : " + userDetailsMapResponse.size());
		
		return userDetailsMapResponse;
	}

	@Override
	public List editUser() {
		System.out.println("UserServiceImpl.editUser()");
		List userList = userDao.editUser();
		System.out.println("\t userList.size() : " + userList.size());
		
		return userList;
	}

	@Override
	public List deleteUser() {
		System.out.println("UserServiceImpl.deleteUser()");
		List userList = userDao.deleteUser();
		System.out.println("\t userList.size() : " + userList.size());
		
		return userList;
	}

	@Override
	public List findUser() {
		System.out.println("UserServiceImpl.findUser()");
		List userList = userDao.findUser();
		System.out.println("\t userList.size() : " + userList.size());
		
		return userList;
	}

	@Override
	public List findAllUsers() {
		System.out.println("UserServiceImpl.findAllUser()");
		List userList = userDao.findAllUser();
		System.out.println("\t userList.size() : " + userList.size());
		
		return userList;
	}

	
}
