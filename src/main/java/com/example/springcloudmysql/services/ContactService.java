package com.example.springcloudmysql.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springcloudmysql.entities.Contact;
import com.example.springcloudmysql.repositories.ContactRepository;

public class ContactService {
	private ContactRepository repository;
	
	@Autowired
	public ContactService(ContactRepository contactRepository) {
		this.repository = contactRepository;
	}
	
	public List findAll() {
		return repository.findAll();
	}
	
	public Optional<Contact> findById(Long id) {
		return repository.findById(id);
	}
	
	public Contact create(Contact contact) {
		return repository.save(contact);
	}
}
