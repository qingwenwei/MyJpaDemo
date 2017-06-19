package com.qingwenwei.MyJpaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class MyJpaDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyJpaDemoApplication.class, args);
	}
}
