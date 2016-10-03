package com.mussatto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SampleController {


    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "HelloController " + name;
    }

    @RequestMapping("/secured")
    public String secured(Principal user) {
        return "Hello, " + user.getName();
    }

}
