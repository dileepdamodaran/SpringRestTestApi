package com.ddn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person" )
public class Person {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
    private Long id;
	
	@Column(name = "first_nm")
	private String firstNm;
	
	@Column(name = "last_nm")
	private String lastNm;
	
	@Column(name = "middle_nm")
	private String middleNm;
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public String getMiddleNm() {
		return middleNm;
	}

	public void setMiddleNm(String middleNm) {
		this.middleNm = middleNm;
	}
}
