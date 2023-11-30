package com.Academia.security.User.controller;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Academia.security.User.entity.AppUser;
import com.Academia.security.User.service.UserService;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserService userService;
	/*@Autowired
	private JavaMailSender mailSender;*/
	
	@GetMapping("")
	public ResponseEntity<?> findAll(){
		return ResponseEntity.ok(userService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		return ResponseEntity.ok(userService.findById(id));
	}
	
	@GetMapping("/info")
	public ResponseEntity<?> loadUserByname(@RequestParam String username){
		return ResponseEntity.ok(userService.loadUserByUsername(username));
	}
	
	@PostMapping("/add")
	public  ResponseEntity<?> addUser(@Valid @RequestBody AppUser newUser) {
		return ResponseEntity.ok(userService.insertUser(newUser));
	}
	
	@PostMapping("/reset_password")
	public String processResetPassword(@RequestParam String userName,String newPass, Model model) {
	    model.addAttribute("title", "Reset your password");
	    userService.updatePassword(userName, newPass);
	    return "your Password Updated successfully";
	}
	
	// Process form submission from forgotPassword page
	@PostMapping("/forgot")
		public ModelAndView processForgotPasswordForm(ModelAndView modelAndView,@RequestParam("email") String userName,@RequestParam Long empNo, HttpServletRequest request) {
		return null;

		}
	
	
	
	
	
}