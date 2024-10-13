package com.spring.reactProj;

import lombok.AllArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
@MapperScan("com.spring.reactProj.mapper") // Mapper가 위치한 패키지
public class ReactProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactProjApplication.class, args);
	}

}
