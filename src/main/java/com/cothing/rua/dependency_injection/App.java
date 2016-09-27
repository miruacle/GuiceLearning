package com.cothing.rua.dependency_injection;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 * Hello world!
 *
 */
public class App {
	@Inject private BadStudent bad;
	
	public static void main(String[] args) {
	/*
		Injector injector = Guice.createInjector(new SchoolModule());
		Provider<BadStudent> provider = injector.getProvider(BadStudent.class);
		provider.get().study();
		
		School school = injector.getInstance(School.class);
		
		school.getTeacher().teach();
		school.getStudent().study();*/
		App app = Guice.createInjector().getInstance(App.class);
		app.test();
	}
	public void test(){
		bad.study();
	}
}
