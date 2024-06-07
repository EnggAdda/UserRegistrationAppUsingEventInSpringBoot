package org.example.userregistrationappusingeventinspringboot;

import org.springframework.context.ApplicationEvent;

public class UserRegistrationEvent  extends ApplicationEvent {

    private String username;

    public UserRegistrationEvent(Object source , String username) {
        super(source);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
