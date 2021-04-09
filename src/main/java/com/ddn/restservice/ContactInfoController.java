package com.ddn.restservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="/contactInfo")
public class ContactInfoController {

	@GetMapping("/getAll")
	public ResponseEntity<Object> getContactInfo( @RequestBody String id){
		List list =  new ArrayList();
		list.add("Dileep");
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Dileep");
	}
}
