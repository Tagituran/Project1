package com.egemsoft.springboot.projectdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egemsoft.springboot.projectdemo.dao.UsersDAO;
import com.egemsoft.springboot.projectdemo.entity.Users;

@Service
public class UsersServiceImplementation implements UsersService{

	private UsersDAO userDAO;
	
	
	@Autowired
	public UsersServiceImplementation(UsersDAO userDAO) {
		this.userDAO = userDAO;
	}



	@Override
	@Transactional
	public List<Users> findAll() {


		return userDAO.findAll();
	}
	
	
	@Override
	@Transactional
	public List<Users> getByEmail(String me){
		
		return userDAO.getByEmail(me);
	}



	@Override
	@Transactional
	public List<Users> getByEmail(String me, String ca) {
		
		
		return userDAO.getByEmail(me, ca);
	}
	
	

}
