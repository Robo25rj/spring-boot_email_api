package com.rohitcode.EmailSender.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohitcode.EmailSender.dto.ContactFormDto;
import com.rohitcode.EmailSender.service.ContactService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")  //to integrate with front end/allow front-end to access it
public class ContactController {
     
	 private final ContactService contactService;

	    public ContactController(ContactService contactService) {
	        this.contactService = contactService;
	    }

	    @PostMapping
	    public ResponseEntity<String> contactMe(@RequestBody ContactFormDto contactForm) {
	        contactService.sendContactEmail(contactForm);
	        return ResponseEntity.ok("Message sent successfully!");
	    }
	
}
