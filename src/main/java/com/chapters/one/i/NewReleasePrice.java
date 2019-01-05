package com.chapters.one.i;

/**
 * @author gushihou
 *	新片价格
 */
public class NewReleasePrice extends AbstractPrice{
	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	
	/** 
	 * @param return double
	 */
	@Override
	double getCharge(int daysRented) {
		return 3 * daysRented;
	}
	
	@Override
	int getFrequentRenterPoints(int daysRented) {
		return daysRented > 1 ? 2 : 1;
	}
}
