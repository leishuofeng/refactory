package com.chapters.one.h;

/**
 * @author gushihou
 *
 */
public abstract class AbstractPrice {
	/**
	 * 获取价格
	 * 
	 * @return int
	 */
	abstract int getPriceCode();
	
	double getCharge(int daysRented) {
		double result = 0;
		// 租赁计费规则
		switch (getPriceCode()) {
		case Movie.REGULAR:
			// 普通片，起步价为2元，租期超过2天的部分每天1.5元
			result += 2;
			if (daysRented > 2) {
				result += (daysRented - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			// 新片，每天3元
			result += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			// 儿童片，起步价1.5元，租期超过3天的部分每天1.5元
			result += 1.5;
			if (daysRented > 3) {
				result += (daysRented - 3) * 1.5;
			}
			break;
		default:
			break;
		}
		return result;
	}
}
