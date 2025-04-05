package com.springboot.spring.controller;

import com.springboot.spring.model.Applications;
import com.springboot.spring.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestApplication {

    private ApplicationService applicationService;

    @Autowired
    public RestApplication(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/Applications")
    public List<Applications> getApplications() {
        return applicationService.findAll();
    }

}
