package com.Academia.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Academia.security.User.entity.AppUser;
import com.Academia.security.User.repository.RoleRepo;
import com.Academia.security.User.service.RoleService;
import com.Academia.security.User.service.UserService;


@Component
public class StartUp implements CommandLineRunner{

	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;
	@Autowired
	RoleRepo roleRepo;
	
	@Override
	public void run(String... args) throws Exception {
	//	userService.insertUser(new AppUser(null, "Ahmed", "Ahmed Hegazy", "123",null, null, true, true, false, false, roleRepo.findByroleId((long)2)));
	/**	if (roleService.findAll().isEmpty()) {			
			roleService.insertRole(new Role(null, "admin"));
			roleService.insertRole(new Role(null, "user"));
			roleService.insertRole(new Role(null, "employee"));
		}
		
		
		if (userService.findAll().isEmpty()) {
			
			Set<Role> adminRoles = new HashSet<>();
			adminRoles.add(roleService.findByName("admin"));
			adminRoles.add(roleService.findByName("user"));
			
			Set<Role> userRoles = new HashSet<>();
			userRoles.add(roleService.findByName("user"));
			
			Set<Role>  empRoles = new HashSet<>();
			empRoles.add(roleService.findByName("employee"));
			
			userService.insertUser(new AppUser(null, "Ahmed Hegazy", "ahmed", "123", adminRoles,true,true,true,true));
			
			userService.insertUser(new AppUser(null, "Ali Mohamed", "ali", "123", userRoles,true,true,true,true));
			
			userService.insertUser(new AppUser(null, "Ahmed Ebraheem", "ibrahim", "123", empRoles,true,true,true,true));
		}*/
		
		
	}

}