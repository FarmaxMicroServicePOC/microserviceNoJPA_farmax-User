package com.bpm.dao.inf;

import java.util.HashMap;
import java.util.List ;

public interface UserDao {

	public List editUser();

	public List deleteUser();

	public List findUser();

	public List findAllUser();

	public HashMap createUser(HashMap userDetailsMap);


	
}
