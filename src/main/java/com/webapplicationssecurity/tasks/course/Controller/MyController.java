package com.webapplicationssecurity.tasks.course.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.webapplicationssecurity.tasks.course.ModelDto.CityDTO;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;





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
        return new List<CityDTO>();
    }
    
    
    



}
