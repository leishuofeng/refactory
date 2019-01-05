/**
 * 
 */
package com.chapters.one.h;

/**   
 * @ClassName:  Rental   
 * @Description:TODO(租赁类)   
 * @author: leishuofeng@aliyun.com 
 * @date:   2019年1月4日   
 *       
 */
public class Rental {
	/**   
	 * @Fields movie : TODO(租赁的影片)   
	 */ 
	private Movie movie;   
	/**   
	 * @Fields movie : TODO(租期)   
	 */
    private int daysRented;           
 
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
    
    
    /**
     * 计算租赁费用
     * @return double
     */
    double getCharge() {
		return movie.getCharge(daysRented);
	}
    
    
    /**
     * 常客积分算法
     * @return int 积分数
     */
    int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
    }
}
