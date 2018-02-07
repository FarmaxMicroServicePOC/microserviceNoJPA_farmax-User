package com.bpm.service;

import java.util.HashMap;
import java.util.List;

public interface UserServiceInf {

	public HashMap createUser(String userDetails);

	public List editUser();

	public List deleteUser();

	public List findUser();

	public List findAllUsers();
}
