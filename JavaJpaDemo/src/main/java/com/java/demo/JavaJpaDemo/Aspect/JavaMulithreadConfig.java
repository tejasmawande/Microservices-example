package com.java.demo.JavaJpaDemo.Aspect;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

@Configuration
@EnableAsync
public class JavaMulithreadConfig {
	
	
	@Bean
	public Executor AsyncTaskExecutor() {
		 final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
				 executor.setCorePoolSize(2);
				 executor.setMaxPoolSize(2);
				 executor.setQueueCapacity(100);
				 executor.setThreadNamePrefix("Tejas thread");
				 executor.initialize();
				 return executor;
	}

	
	
}
