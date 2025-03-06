package com.example.AddressBookMap.repository;



import com.example.AddressBookMap.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {}