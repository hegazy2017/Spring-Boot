package com.Academia.security.User.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Academia.security.User.entity.Role;
import com.Academia.security.User.repository.RoleRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleService {
	
	@Autowired
	private  RoleRepo roleRepo ;

	public List<Role> findAll(){
		return roleRepo.findAll();
	}

	public Role getById(Long id) {
		return roleRepo.findByroleId(id);
	}
	
	public Role insertRole(Role newRole){
		return roleRepo.save(newRole);
	}
}
