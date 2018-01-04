package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Contact;

@Mapper
public interface ContactMapper {

	@Select("select * from contact")
	List<Contact> findAllContacts();
}
