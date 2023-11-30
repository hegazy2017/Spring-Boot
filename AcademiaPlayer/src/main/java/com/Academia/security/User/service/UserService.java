package com.Academia.security.User.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.Academia.error.RecordNotFoundException;
import com.Academia.repository.MsgStatusRepo;
import com.Academia.security.User.entity.AppUser;
import com.Academia.security.User.model.AppUserDetail;
import com.Academia.security.User.repository.UserRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo ;
	@Autowired
	MsgStatusRepo msgRepo;

	@Autowired
	PasswordEncoder PasswordEncoder;
	
	

	public List<AppUser> findAll(){
		return userRepo.findAll();
	}
	
	public Optional<AppUser> findById(Long id){
		return userRepo.findById(id);
	}
	
	public AppUser insertUser(AppUser newUser){
		newUser.setPassword(PasswordEncoder.encode(newUser.getPassword()));
		return userRepo.save(newUser);
	}
	
	
	     
	    public AppUser getByResetPasswordToken(String token) {
	        return userRepo.findByResetPasswordToken(token);
	    }
	
	  
	
	 public AppUser updatePassword(String userName,String newPassword) {
		 Optional<AppUser> appUser=userRepo.findByUserName(userName); 
		 if(!appUser.isPresent()) {
			 AppUser newUser = appUser.get();
		    	  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		    	  newUser.setPassword(passwordEncoder.encode(newPassword));
			       return userRepo.save(newUser);
		    }else {
				throw new RecordNotFoundException("402",String.valueOf(userName),msgRepo.findByStatusCode(402));
		    }
	    }
	
	
	
	
	
	
	
	
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Optional<AppUser> appUser=userRepo.findByUserName(username); 
	if(!appUser.isPresent()) {
		throw new UsernameNotFoundException("This User NOt Found");
	}
		return new AppUserDetail(appUser.get());
	}
	

	
}
