package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entity.Student;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigureFile.class);
		Student s = context.getBean("student",Student.class);
		System.out.println(s);
	}
}
