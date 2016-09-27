package com.cothing.rua.multibindings.shape;

import com.google.inject.AbstractModule;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.multibindings.Multibinder;

public abstract class ShapeModule extends AbstractModule {

	private Multibinder<Shape> shapeBinder;
	
	@Override
	protected void configure() {
		shapeBinder = Multibinder.newSetBinder(binder(), Shape.class);
		configureShapes();
	}
	
	protected abstract void configureShapes	();
	
	protected final LinkedBindingBuilder<Shape> bindShape() {
	    return shapeBinder.addBinding();
	  }
}
