package com.egemsoft.springboot.projectdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.egemsoft.springboot.projectdemo.entity.Users;


@Repository
public class UsersDAOHibernateImplementation implements UsersDAO {

	//define field for entity manager
	
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public UsersDAOHibernateImplementation(EntityManager entitymanager) {
		this.entityManager = entitymanager;
	}
	
	@Override
	public List<Users> findAll() {
		
		//get the current hibernate session
		Session currentSession=entityManager.unwrap(Session.class);
		
		//create a query
		Query<Users> theQuery=
				currentSession.createQuery("from Users", Users.class);
		
		
		//execute query and get result list
		List<Users> users=theQuery.getResultList();
		
		//return the results
		return users;
	}
	
	// Filtered email by keyword me if ends with me ((me gets input from user with @PathVariable annotation in controller by the way)) 

	@Override
	public List<Users> getByEmail(String me) {
		
		Session currentSession=entityManager.unwrap(Session.class);
		
		Query<Users> theQuery=
				currentSession.createQuery("from Users u where u.email LIKE :me", Users.class).setParameter("me", "%"+me);
		
		List<Users> usersemail=theQuery.getResultList();
		
		return usersemail;
	}
	
	//Filtered email by two keywords (me and ca) with or clause ((me and ca gets input from user with @PathVariable annotation in controller by the way))

	@Override
	public List<Users> getByEmail(String me, String ca) {
		
		Session currentSession=entityManager.unwrap(Session.class);
		
		Query<Users> theQuery=
				currentSession.createQuery("from Users u where u.email LIKE :me OR u.email LIKE :ca", Users.class);
		
		
		theQuery.setParameter("me", "%"+me);
		theQuery.setParameter("ca", "%"+ca);
		
		List<Users> emailor=theQuery.getResultList();
		
		return emailor;
	}
	
	
}

