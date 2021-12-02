package com.bridgelabz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Purpose: This is a controller class which uses Thymeleaf dependency to render html pages.
 *
 * @author Ashwith
 * @since 1/12/21
 */
@Controller
public class HelloWorldController {

    /**
     * Purpose : This method is used to get greeting hello message from BridgeLabz using RestController
     *
     * @return  hello message
     */
    @GetMapping("/web")
    public String hello(){
        return "Hello";
    }

    /**
     * Purpose : This method is used to access Custom Greeting Hello message from Bridgelabz
     *
     * @param model is used as a container storing the message attribute value in MVC architecture
     * @return the Greeting Custom Hello message from Bridgelabz
     */
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message", "This is a custom message. Hello From bridgelabz");
        return "message";
    }
}
