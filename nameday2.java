package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.*;
@RestController


public class nameday2 {




	    @Value("SNEHA")
	    private String name;
	    
	    @GetMapping("/")
	    public String getName()
	    {
	    	return name;
	    }
	}