package com.cothing.rua.dependency_injection.multibindings.shape;

import com.google.inject.Guice;

public class App {

	public static void main(String[] args) {

		ShapeBuilder builder = Guice.createInjector(new ShapeBuilderModule()).getInstance(ShapeBuilder.class);
		builder.showShape();

	}
}
