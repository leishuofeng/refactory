/**
 * 
 */
package com.chapters.one.e;

/**   
 * @ClassName:  Rental   
 * @Description:TODO(租赁类)   
 * @author: leishuofeng@aliyun.com 
 * @date:   2019年1月4日   
 *       
 */
public class Rental {
	private Movie movie;              //租赁的影片
    private int daysRented;           //租期
 
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
 
    public Movie getMovie() {
        return movie;
    }
 
    public int getDaysRented() {
        return daysRented;
    }
    
    double getCharge(){
		double result = 0;
		// 租赁计费规则
		switch (getMovie().getPriceCode()) {
		case Movie.REGULAR:
			// 普通片，起步价为2元，租期超过2天的部分每天1.5元
			result += 2;
			if (getDaysRented() > 2) {
				result += (getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			// 新片，每天3元
			result += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			// 儿童片，起步价1.5元，租期超过3天的部分每天1.5元
			result += 1.5;
			if (getDaysRented() > 3) {
				result += (getDaysRented() - 3) * 1.5;
			}
			break;
		default:
			break;
		}
		return result;
	}
}
