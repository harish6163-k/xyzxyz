package com.school.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Teachers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String tchr1;
	private String tchr2;
	private int id1;
	private int id2;
	public String getTchr1() {
		return tchr1;
	}
	public void setTchr1(String tchr1) {
		this.tchr1 = tchr1;
	}
	public String getTchr2() {
		return tchr2;
	}
	public void setTchr2(String tchr2) {
		this.tchr2 = tchr2;
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public int getId2() {
		return id2;
	}
	public void setId2(int id2) {
		this.id2 = id2;
	}
	
	
}