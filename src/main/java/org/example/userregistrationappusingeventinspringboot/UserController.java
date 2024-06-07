package org.example.userregistrationappusingeventinspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRegistrationService userRegistrationService;
    @GetMapping("/register")
    public String getRegister(@RequestParam String user)
    {
      userRegistrationService.register(user);
     return  "user registration is done!";
    }
}
