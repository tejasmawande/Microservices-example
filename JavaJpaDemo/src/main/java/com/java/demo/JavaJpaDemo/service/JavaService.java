package com.java.demo.JavaJpaDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.java.demo.JavaJpaDemo.repository.EMPLOYEES;
import com.java.demo.JavaJpaDemo.repository.Repo;

@Service
public class JavaService {

 @Autowired
 Repo repository;
	
 @Async
 public CompletableFuture<List<EMPLOYEES>> updateEmployee(){
	 repository.updateEmail();
	 return CompletableFuture.completedFuture(null);
	 
 }

 @Async
 public CompletableFuture<List<EMPLOYEES>> getDatabyRepo() {
	 
	 List<EMPLOYEES> employeeList = new ArrayList();
	 employeeList = repository.findAll();
	 return CompletableFuture.completedFuture(employeeList);
 }
	
}
