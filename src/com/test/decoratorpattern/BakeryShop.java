package com.test.decoratorpattern;

public class BakeryShop {

	public static void main(String[] args) {
		Cake cake = new CrunchyButterscotchCake(new NormalCake());
		cake.prepare();
	}
}

