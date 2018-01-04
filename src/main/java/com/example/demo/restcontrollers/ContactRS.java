package com.example.demo.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ContactMapper;
import com.example.demo.model.Contact;

@RequestMapping(value="/oraclemybatisrest")
@RestController
public class ContactRS {

	//This is Autowired in the Constructor
	private ContactMapper contactMapper;
	
	//By default, Spring Boot Autowires params passed in Constructors!!
	public ContactRS(ContactMapper contactMapper) {
		this.contactMapper = contactMapper;
	}
	
	@GetMapping("/allContacts")
	public ResponseEntity<List<Contact>> findAllContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		
		contactMapper.findAllContacts().forEach(contacts::add);
		
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
	}
}
