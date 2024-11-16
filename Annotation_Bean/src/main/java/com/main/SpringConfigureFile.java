package com.main;

import org.springframework.context.annotation.Bean;

import com.entity.Student;

public class SpringConfigureFile {

	@Bean("student")
	public Student studobj()
	{
		return (new Student());
	}
}
