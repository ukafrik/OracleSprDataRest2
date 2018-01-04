package com.example.demo;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ContactMapper;

@MappedTypes(ContactMapper.class)
@MapperScan("com.example.demo.dao")
@SpringBootApplication
public class OracleSprDataRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(OracleSprDataRest2Application.class, args);
	}
}
