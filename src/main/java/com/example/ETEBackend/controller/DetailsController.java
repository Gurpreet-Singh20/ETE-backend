package com.example.ETEBackend.controller;


import com.example.ETEBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailsController {


    @RequestMapping("/details")
    public String details(){
        return "details";
    }

}


