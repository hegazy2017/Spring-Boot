package com.Academia.security.User.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Academia.security.User.entity.Role;
import com.Academia.security.User.service.RoleService;


@RestController
@RequestMapping("/api/v1/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	
	@GetMapping("")
	public ResponseEntity<?> findAll(){
		return ResponseEntity.ok(roleService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@Valid @PathVariable Long id){
		return ResponseEntity.ok(roleService.getById(id));
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addRole(@Valid @RequestBody Role newRole){
		return ResponseEntity.ok(roleService.insertRole(newRole));
	}
}
