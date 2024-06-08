package com.webapplicationssecurity.tasks.course.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.webapplicationssecurity.tasks.course.ModelDto.CityDTO;
import com.webapplicationssecurity.tasks.course.ModelDto.UserDTO;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/HELLOWORLD")
    public String getMethodName() {
        return "Hello World";
    }

    @PostMapping("/POST")
    public Boolean postMethodName(@RequestBody CityDTO city) {
        return true;
    }
    

    @GetMapping("/findall")
    public List<CityDTO> getALL() {
        return  null;
    }

        @PostMapping("/Login")
    public ResponseEntity<String> login(@Validated @RequestBody UserDTO userdto,BindingResult bindingResult) {
    
          if (bindingResult.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder();
            bindingResult.getAllErrors().forEach(error -> errorMessage.append(error.getDefaultMessage()).append("\n"));
            return ResponseEntity.badRequest().body(errorMessage.toString());
        }
        
        // Handle validated user
        return ResponseEntity.ok("User created successfully");
    }
    
}
