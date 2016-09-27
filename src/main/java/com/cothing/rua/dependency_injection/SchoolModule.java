package com.cothing.rua.dependency_injection;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class SchoolModule extends AbstractModule {

	@Override
	protected void configure() {

		bind(Teacher.class).to(GoodTeacher.class);
		bind(Student.class).to(GoodStudent.class);
	}
	/*
	@Provides
	public BadStudent provideBadStudent(){
		return new BadStudent();
	}*/

}
