package com.ocumedix.healthcare.controller;

import com.ocumedix.healthcare.model.UserMessageVO;
import com.ocumedix.healthcare.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OcumedixController {
    @Autowired
    private UserMessageService userMessageService;

    @GetMapping("/")
    public String displayWebPage(){
        return "dashboard";
    }

    @GetMapping("/products")
    public String displayProductPage(){
        return "product";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("userMessage",new UserMessageVO());
        return "contact";
    }

    @PostMapping("/contact/save")
    public String saveUserDetails(@ModelAttribute UserMessageVO userMessage) throws Exception {
        userMessageService.saveUser(userMessage);
        return "contact-success";
    }


}
