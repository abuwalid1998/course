package com.webapplicationssecurity.tasks.course.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapplicationssecurity.tasks.course.ModelDto.UserDTO;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping
@RestController("/AuthApi")
public class AuthController {


    @PostMapping("/Login")
    public String login(@Validated @RequestBody UserDTO userdto) {
        
        return "Created Succssfully";
    }
    
}
