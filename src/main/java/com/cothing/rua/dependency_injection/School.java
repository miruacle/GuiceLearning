package com.cothing.rua.dependency_injection;

import com.google.inject.Inject;

public class School {

	private Teacher teacher;
	private Student student;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public Student getStudent() {
		return student;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Inject
	public School(Teacher teacher, Student student){
		this.teacher = teacher;
		this.student = student;
	}
	
	@Override
	public String toString(){
		return teacher.toString() + student.toString();
	}
	
}
