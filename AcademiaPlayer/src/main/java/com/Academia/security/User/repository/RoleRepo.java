package com.Academia.security.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Academia.security.User.entity.Role;




@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByroleId(Long roleId);
}
