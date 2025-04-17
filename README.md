This is a Java Spring Boot application that allows users to send emails through a simple REST API. It uses JavaMailSender to deliver messages to a specified recipient directly from the backend. It can be integrated with frontend applications like contact forms or feedback systems.

✅ Features
Send emails via a RESTful API
Accepts parameters like: name, email, subject, and message
Sends formatted emails to the configured recipient
Cross-Origin support for frontend integration
Easily configurable using application.properties

🛠 Technologies Used
Java
Spring Boot
Spring Web
Spring Boot Starter Mail (JavaMailSender)
REST API
CORS Configuration

🔧 How It Works
A frontend (like an HTML form) sends a POST request with user data.
The Spring Boot API receives and processes the request.
The app sends a well-formatted email to your inbox using SMTP settings.
