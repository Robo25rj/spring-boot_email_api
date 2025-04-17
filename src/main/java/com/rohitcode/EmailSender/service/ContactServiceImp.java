package com.rohitcode.EmailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.rohitcode.EmailSender.dto.ContactFormDto;

@Service
public class ContactServiceImp implements ContactService {

	@Autowired
	 private  JavaMailSender mailSender;
	
	  @Value("${spring.mail.from}")
	    private String fromEmail;

	    @Value("${spring.mail.username}")
	    private String toEmail;

	    public void ContactServiceImpl(JavaMailSender mailSender) {
	        this.mailSender = mailSender;
	    }
	 
	@Override
	public void sendContactEmail(ContactFormDto contactForm) {
		
		
		SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail); // You (receiver)
        message.setSubject("New Contact: " + contactForm.getSubject());
        message.setReplyTo(contactForm.getEmail());


        message.setText(
        		"You received a new message from your portfolio contact form:\n\n" +
                "Name: " + contactForm.getName() + "\n" +
                "Email: " + contactForm.getEmail() + "\n" +
                "Subject: " + contactForm.getSubject() + "\n" +
                "Message: \n" + contactForm.getMessage()
        );

        mailSender.send(message);
	}

}
