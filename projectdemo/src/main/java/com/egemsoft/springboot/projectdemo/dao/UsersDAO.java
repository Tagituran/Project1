package com.egemsoft.springboot.projectdemo.dao;

import java.util.List;

import com.egemsoft.springboot.projectdemo.entity.Users;


public interface UsersDAO {
	
	public List<Users> findAll();
	
	public List<Users> getByEmail(String me);
	
	public List<Users> getByEmail(String me, String ca);

}
