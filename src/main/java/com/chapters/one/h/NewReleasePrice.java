package com.chapters.one.h;

/**
 * @author gushihou
 *	新片价格
 */
public class NewReleasePrice extends AbstractPrice{
	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
}
