package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repositories.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepo;
    
	@Override
	public void saveContact(Contact contacts) {
		contactRepo.save(contacts);
		
	}

	@Override
	public List<Contact> getAllContacts() {
         List<Contact> contacts = contactRepo.findAll();
         
		return contacts;
	}

	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
