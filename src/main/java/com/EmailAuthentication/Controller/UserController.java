package com.EmailAuthentication.Controller;

import com.EmailAuthentication.Entities.User;
import com.EmailAuthentication.Services.EmailSenderService;
import com.EmailAuthentication.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userServices;

    @Autowired
    EmailSenderService emailSenderService;

    @PostMapping("/save")
    public boolean storeUser(@RequestBody User user){
        System.out.println("in");
        return userServices.saveUser(user);
    }
    @GetMapping("/get/{id}")
    public Optional<User> getUserById(@PathVariable("id") long id){
        return userServices.getUserById(id);
    }
    @GetMapping("/send")
    public void sendEmail(){
        String email="estehaar.emon@northsouth.edu";
        String subject="Testing";
        String body="This email is sent to you to tell you that potka is the thiccest";
        emailSenderService.sendEmail(email,subject,body);
    }
}
