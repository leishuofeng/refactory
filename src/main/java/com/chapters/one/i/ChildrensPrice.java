package com.chapters.one.i;

/**
 * 
 * @author gushihou
 * 儿童影片价格
 */
public class ChildrensPrice extends AbstractPrice{
	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
	@Override
	double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}
}
