package com.Academia.security.User.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Academia.security.User.entity.AppUser;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Long> {
	AppUser findByid(Long userId);

	Optional<AppUser> findByUserName(String userName);

	public AppUser findByResetPasswordToken(String token);

}
