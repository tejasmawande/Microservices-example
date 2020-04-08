package com.java.demo.JavaJpaDemo.Aspect;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class JavaMultiThread {

	@Async
	public void someAsyncMethod() {
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("My Thread Name is "+Thread.currentThread().getName());
	}
	
}
