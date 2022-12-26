package com.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DockerController {

    @RequestMapping("/")
    public String displayContactPage() {
        return "index";
    }
    
}
