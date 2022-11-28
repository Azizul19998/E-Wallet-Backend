package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get-user-by-name")
    public User getUserByUserName(@RequestParam("userName") String userName) throws Exception{
        return userService.getUserByUserName(userName);
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody UserRequest userRequest)  {
        userService.createUser(userRequest);
    }

}
