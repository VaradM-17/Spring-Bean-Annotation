package com.entity;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("211")
	private int stud_id;
	@Value("Varad")
	private String stud_name;

	public Student() {
		super();
	}

	public Student(int stud_id, String stud_name) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + "]";
	}

}
