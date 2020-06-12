package com.test.decoratorpattern;

public class CrunchyButterscotchCake extends CakeDecorator {

	public CrunchyButterscotchCake(Cake cake) {
		super(cake);
	}

	public void prepare() {
		super.prepare();
		addCherryWithPrettyMessage();
	}

	public void addCherryWithPrettyMessage() {
		System.out.println("Adding cherry with additional wishing message.....");
	}
}
