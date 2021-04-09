package com.ddn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ddn.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	  List<Person> findByLastNm(String lastName);

	  Person findById(long id);
	  
	// @Query(value="select p.firstNm as firstNm, p.lastNm as lastNm,p.id as id from contact p", nativeQuery=true)
	  public List<Person> findAll();
	}
