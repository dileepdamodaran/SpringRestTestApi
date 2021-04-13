package com.ddn.service.impl;

import java.util.ArrayList;
import java.util.Collections;
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
		List<Person> persons = new ArrayList();
		Person p1 = new Person(1L,"dileep","damodaran");
		Person p2 = new Person(2L, "dan","abcd");
		Person p3 = new Person(2L, "abcd","abcd");
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		Collections.sort(persons, (o1,o2)->o1.getFirstNm().compareTo(o2.getFirstNm()));
		return (List<Person>) personRepository.findAll();
	}

}
