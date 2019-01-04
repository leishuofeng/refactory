/**
 * 
 */
package com.chapters.one;

/**   
 * @ClassName:  Rental   
 * @Description:TODO(租赁类)   
 * @author: leisf@saiwish.com 
 * @date:   2019年1月4日 下午2:10:15   
 *     
 * @Copyright: 2019 www.sailwish.com Inc. All rights reserved.  
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
