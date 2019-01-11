/**
 * 
 */
package com.chapters.sixth.replaceTempWithQuery;

/**   
 * @ClassName:  exampleA   
 * @Description:TODO(Replace Temp With Query 以查询替换临时变量)   
 * @author: leishuofeng@aliyun.com 
 * @date:   2019年1月11日   
 */
public class exampleA {
	double _quality = 1.0;
	double _itemPrice = 1.0;
	
	/** 
	 * 使用替换临时变量之前的方法
	 * @param _quality
	 * @param _itemPrice
	 * @return double
	 */
	double methodBefore() {
		double basePrice = _quality * _itemPrice;
		if (basePrice > 1000){
			return basePrice * 0.95;
		}else{
			return basePrice * 0.98;
		}
	}
	
	
	// *************************************************
	// ************** 使用 Rplace Temp With Query ********
	// *************************************************
	
	
	/**
	 * 这个方法中 存在 basePrice 临时变量
	 * 使用一个 查询函数 来替换 临时变量 
	 * @param _quality
	 * @param _itemPrice
	 * @return
	 */
	double methodAfter() {
		if (basePrice() > 1000){
			return basePrice() * 0.95;
		}else{
			return basePrice() * 0.98;
		}
	}
	
	double basePrice() {
		return _quality * _itemPrice;
	}
}
