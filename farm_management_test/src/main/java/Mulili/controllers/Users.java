package Mulili.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Users {
    @GetMapping("/")
     public String dashboard(){
         return"index";
     }
     @GetMapping("/employee/profile")
     public String employeeProfile() {
         return "index"; 
     }


}
