package com.java.demo.JavaJpaDemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.JavaJpaDemo.Aspect.JavaMultiThread;
import com.java.demo.JavaJpaDemo.repository.EMPLOYEES;
import com.java.demo.JavaJpaDemo.repository.Repo;
import com.java.demo.JavaJpaDemo.service.JavaService;

@RestController
public class Controller {

	@Autowired
	JavaService service;
	
	@Autowired
	Repo repo;
	
	@Autowired
	JavaMultiThread javaMultiThread;
	
	@GetMapping("/getAlldata")
	public @ResponseBody ResponseEntity getalldata() {
	
		CompletableFuture<List<EMPLOYEES>> all1 = service.getDatabyRepo();
		CompletableFuture<List<EMPLOYEES>> all2 = service.getDatabyRepo();
		CompletableFuture<List<EMPLOYEES>> all3 = service.getDatabyRepo();
		
		CompletableFuture.allOf(all1 ,all2,all3).join();
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	@GetMapping("/updateEmail")
	public void updateEmail() {
		repo.updateEmail();
	}
	
	@GetMapping("/multithreading")
	public void getCurrentThread() {
		
		javaMultiThread.someAsyncMethod();
	}
}
