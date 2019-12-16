package com.egemsoft.springboot.projectdemo.service;

import java.util.List;

import com.egemsoft.springboot.projectdemo.entity.Users;

public interface UsersService {
	
	public List<Users> findAll();
	
	public List<Users> getByEmail(String me);

	public List<Users> getByEmail(String me, String ca);
}
