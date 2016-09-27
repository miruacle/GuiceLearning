package com.cothing.rua.multibindings.shape;

public class ShapeBuilderModule extends ShapeModule {

	@Override
	protected void configureShapes() {
			bindShape().to(Circle.class);
			bindShape().to(Square.class);
	}

}
