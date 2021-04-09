package com.ddn.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ddn.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

	  List<Person> findByLastNm(String lastName);

	  Person findById(long id);
	}
