package com.cothing.rua.dependency_injection.multibindings.shape;

import java.util.Set;

import com.google.inject.Inject;

public class ShapeBuilder {

	private Set<Shape> shapes;
	@Inject
	public ShapeBuilder(Set<Shape> shapes){
		this.shapes = shapes;
	}
	
	public void showShape(){
		for(Shape s : shapes)
			System.out.println(s.toString());
	}
}
