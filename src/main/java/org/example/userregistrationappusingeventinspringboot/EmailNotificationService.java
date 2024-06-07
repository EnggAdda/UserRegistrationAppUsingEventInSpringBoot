package org.example.userregistrationappusingeventinspringboot;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService {
    @EventListener
    public String sendEmail(UserRegistrationEvent  event) {
        String user = event.getUsername();
        System.out.println("email is sent to " + user);
       return  "email is sent to the registered user "+user;
    }
}
