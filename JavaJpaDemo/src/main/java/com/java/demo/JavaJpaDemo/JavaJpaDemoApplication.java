package com.java.demo.JavaJpaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableAsync
public class JavaJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaJpaDemoApplication.class, args);
	}

}
