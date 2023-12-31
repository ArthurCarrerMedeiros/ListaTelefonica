package com.example.springcloudmysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springcloudmysql.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
