package com.chapters.one.i;

/**
 * @author gushihou
 *	普通影片价格
 */
public class RegularPrice extends AbstractPrice{
	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}
	
	/** 
	 * @param return double
	 */
	@Override
	double getCharge(int daysRented) {
		/*
		 * 重写父类中的 getCharge() 方法, 
		 * 如果是新片就会调用自己的计算价钱方法,
		 * 从而达到去掉父类中的判断类型的 switch 语句的目的
		 */
		double result = 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1.5;
		}
		return result;
	}
}
