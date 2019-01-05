package com.chapters.one.h;

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
}
