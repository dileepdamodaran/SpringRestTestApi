package com.ddn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddn.entity.Person;
import com.ddn.repository.PersonRepository;
import com.ddn.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public List<Person> getAllContactInfo() {
		
		return (List<Person>) personRepository.findAll();
	}

}
