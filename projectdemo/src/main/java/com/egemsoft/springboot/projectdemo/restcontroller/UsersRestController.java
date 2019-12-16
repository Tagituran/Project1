package com.egemsoft.springboot.projectdemo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egemsoft.springboot.projectdemo.entity.Users;
import com.egemsoft.springboot.projectdemo.service.UsersService;


@RestController
@RequestMapping("/xxx")
public class UsersRestController {
	
	private UsersService usersService;

	@Autowired
	public UsersRestController(UsersService theUsersDao) {
		this.usersService = theUsersDao;
	}
	
	@GetMapping("/allUsers")
	public List<Users> findAll(){
		
		
		return usersService.findAll();
	}
	
	@PostMapping("/email/{me}")
	public List<Users> getByEmail(@PathVariable String me){
		
		List<Users> theUsers=usersService.getByEmail(me);
		
		return theUsers;
	}
	
	//When i try to use Post Mapping i got null, but it works when i use GET METHOD
	@PostMapping("/email/{me},{ca}")
	public List<Users> getByEmail(@PathVariable String me, @PathVariable String ca){
		
		List <Users> theUsers=usersService.getByEmail(me, ca);
		
		return theUsers;
	}
	

}
