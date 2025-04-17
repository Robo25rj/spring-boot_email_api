package com.rohitcode.EmailSender.service;

import com.rohitcode.EmailSender.dto.ContactFormDto;

public interface ContactService {
     
	void  sendContactEmail(ContactFormDto contactForm);
}
