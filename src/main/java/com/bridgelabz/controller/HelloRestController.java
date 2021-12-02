package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose: This is to stimulate hello messages using Rest Controller.
 *
 * @author Ashwith
 * @since 1/12/21
 */
@RestController
@RequestMapping("/hello")
public class HelloRestController {

    /**
     * This method is to show hello message using Get Mapping request method.
     *
     * @return String hello message.
     */
    @GetMapping("")
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
}
