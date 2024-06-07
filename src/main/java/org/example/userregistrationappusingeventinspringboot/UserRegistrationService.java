package org.example.userregistrationappusingeventinspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private ApplicationEventPublisher  applicationEventPublisher;

    public void register(String user){
        UserRegistrationEvent  event = new UserRegistrationEvent(this,user);
        System.out.println("user is inserted into registration db ");
        applicationEventPublisher.publishEvent(event);
    }
}
