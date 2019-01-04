/**
 * 
 */
package com.chapters.one.a;

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
}
