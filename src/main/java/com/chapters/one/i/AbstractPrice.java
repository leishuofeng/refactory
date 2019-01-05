package com.chapters.one.i;

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
	
	/**
	 * 计算总价
	 * @param daysRented
	 * @return
	 */
	abstract double getCharge(int daysRented);
	
	/**
	 * 常客积分算法
	 * 
	 * @return int 积分数
	 */
	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
