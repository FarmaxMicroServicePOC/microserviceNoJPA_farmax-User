package com.bpm.dao.impl;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.bpm.dao.inf.UserDao;
import com.bpm.model.User;


@Repository("userDao")
public class UserDaoImpl implements UserDao{
	private static Logger log = Logger.getLogger(UserDaoImpl.class.getName()); 
	
	@Override
	public HashMap createUser(HashMap userDetailsMap) {
		log.info("UserDaoImpl.createUser()");
		System.out.println("UserDaoImpl.java : createUser()");
		userDetailsMap.put("UserCreation", "success");
		
		String IP = "";
		try {
			IP = Inet4Address.getLocalHost().getHostAddress();
			System.out.println("\t Inet4Address.getLocalHost().getHostAddress() : " + IP
					         + "\n\t Inet4Address.getLocalHost() : " + Inet4Address.getLocalHost());
			System.out.println("\t InetAddress.getLocalHost().getHostAddress() : " + InetAddress.getLocalHost().getHostAddress()
							 + "\n\t InetAddress.getLocalHost() : " + InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			System.out.println("Exception thrown while fetching IP address");
			e.printStackTrace();
			
		}
		userDetailsMap.put("IP", IP);
		
		System.out.println("\t userDetailsMap : " + userDetailsMap.toString());
		
		return userDetailsMap;
	}

	@Override
	public List<User> editUser() {
		log.info("UserDaoImpl.editUser()");
		return null;
	}

	@Override
	public List<User> deleteUser() {
		log.info("UserDaoImpl.deleteUser()");
		return null;
	}

	@Override
	public List<User> findUser() {
		log.info("UserDaoImpl.findUser()");
		return null;
	}

	@Override
	public List<User> findAllUser() {
		log.info("UserDaoImpl.findUser()");
		return null;
	}

}
