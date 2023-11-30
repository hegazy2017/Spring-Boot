package com.Academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import com.Academia.entity.MsgStatus;


@Repository
public interface MsgStatusRepo extends JpaRepository<MsgStatus,Long> ,JpaSpecificationExecutor<MsgStatus>{
	MsgStatus findByStatusCode(int statusCode);
	}
