/**
 * 
 */
package com.chapters.sixth.replaceTempWithQuery;

/**   
 * @ClassName:  exampleB   
 * @Description:TODO()   
 * @author: leishuofeng@aliyun.com 
 * @date:   2019年1月11日   
 */
public class exampleB {
	int _quantity = 1;
	int _itemPrice = 1;
	
	
	/**
	 * 重构前的方法
	 * @return
	 */
	double getPriceBefore() {
		int basePrice = _quantity * _itemPrice;
		double discountFactor;
		if (basePrice > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}
	
	// *************************************************
	// ************** 使用 Rplace Temp With Query ********
	// *************************************************
	
	double getPriceAfter() {
		return basePrice() * discountFactor();
	}
	
	private int basePrice() {
		return _quantity * _itemPrice;
	}
	
	private double discountFactor() {
		if (basePrice() > 1000) {
			return 0.95;
		} else {
			return 0.98;
		} 
	}
	
	// basePrice() 如果不被提炼， discountFactor() 也难以被提炼
}
