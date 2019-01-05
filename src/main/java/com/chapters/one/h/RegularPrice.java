package com.chapters.one.h;

/**
 * @author gushihou
 *	普通影片价格
 */
public class RegularPrice extends AbstractPrice{
	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}
}
