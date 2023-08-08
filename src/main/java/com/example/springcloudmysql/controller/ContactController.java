package com.example.springcloudmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloudmysql.repositories.ContactRepository;

@RestController
@RequestMapping({"/contacts"})
public class ContactController {
	private ContactRepository repository;
	
	@Autowired
	public ContactController(ContactRepository contactRepository) {
		this.repository = contactRepository;
	}
}
