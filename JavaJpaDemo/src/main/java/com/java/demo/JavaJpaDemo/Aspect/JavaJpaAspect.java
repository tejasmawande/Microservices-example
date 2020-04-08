package com.java.demo.JavaJpaDemo.Aspect;

import java.sql.Timestamp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JavaJpaAspect {

	
	@Before(value = "execution(* com.java.demo.JavaJpaDemo.service.JavaService.*(..))")
	public void beforeAdvice(JoinPoint joinpoint) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Before Running Service Class"+ joinpoint.getSignature());
		System.out.println("TimeStamp before Service Class"+timestamp);
	}
	
	
	@After(value = "execution(* com.java.demo.JavaJpaDemo.service.JavaService.*(..))")
	public void afterAdvice(JoinPoint joinpoint) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("After Running Service Class"+ joinpoint.getSignature());
		System.out.println("TimeStamp After Service Class"+timestamp);
	}
}
