package com.test.decoratorpattern;

public abstract class CakeDecorator implements Cake {

	private Cake cake;

	public CakeDecorator(Cake cake) {
		super();
		this.cake = cake;
	}

	@Override
	public void prepare() {
		cake.prepare();
	}
}
