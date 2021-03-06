package com.toov5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.toov.mapper")
@SpringBootApplication
public class AppDispatch {

	public static void main(String[] args) {
		SpringApplication.run(AppDispatch.class, args);
	}

}
