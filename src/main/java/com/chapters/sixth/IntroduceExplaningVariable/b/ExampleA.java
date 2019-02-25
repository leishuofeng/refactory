package com.chapters.sixth.IntroduceExplaningVariable.b;

public class ExampleA {
	int quantity = 100;
	double itemPrice = 50.0;
	
	private double price() {
		// price is base price - quantity discount + shipping
		return quantity * itemPrice - Math.max(0, quantity - 500) * itemPrice * 0.05 + 
				Math.min(quantity * itemPrice * 0.01, 100.0);
	}
	
	private double priceAfter() {
		// 提炼复杂表达式，引入解析型变量
		final double basePrice = quantity * itemPrice;
		final double discount = Math.max(0, quantity - 500) * itemPrice * 0.05;
		final double shipping = Math.min(basePrice * 0.01, 100.0);
		// 现在的返回值就能很清晰的表达自己的意义
		return basePrice - discount + shipping;
	}
	
	
	// 当一个过长的函数，临时变量过多的时候，让函数变得过长的时候，
	// 我们又可以使用extract method 的手法来去掉这些临时变量
	
	private double priceAfter1() {
		return basePrice() - discount() + shipping();
	}
	
	private double basePrice() {
		return quantity * itemPrice;
	}
	
	private double discount() {
		return Math.max(0, quantity - 500) * itemPrice * 0.05;
	}
	
	private double shipping() {
		return Math.min(basePrice() * 0.01, 100.0);
	}
}
