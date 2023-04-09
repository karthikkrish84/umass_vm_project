package com.example.umass_vm_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/getdetails")
    public String getDetails(){
        return "Hello I'm here";
    }
}
