package com.zohocrm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	
	ContactService contactService;
	
	
	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}

      @RequestMapping("/listallcontacts")
	  public String listAllLeads(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		  
	  }
	}

