package com.java.demo.JavaJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<EMPLOYEES, Long> {

	@Query("Update EMPLOYEES set EMAIL='tejas@gmail.com' where Id = 2;")
	public Long updateEmail();
}
