package com.mycompany.firstappp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.firstappp.service.impl.AddServiceImpl;
import com.mycompany.firstappp.service.interfaces.AddService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/add")

public class AddController {
	
	@GetMapping("/twoNumber")
	public int add(@RequestParam int val1, @RequestParam int val2)
	{
		System.out.println("Incoming Data" + val1 +"and" + val2);
		
		AddService addService = new AddServiceImpl();
		
		return addService.addService(val1, val2);
		
	}

}
