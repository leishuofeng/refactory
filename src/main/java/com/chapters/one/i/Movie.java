                              package com.chapters.one.i;

/**   
 * @ClassName:  test   
 * @Description:TODO(电影类)   
 * @author: leishuofeng@aliyun.com 
 * @date:   2019年1月4日   
 *       
 */
public class Movie {

    public static final int REGULAR = 0;            //普通影片
    public static final int NEW_RELEASE = 1;        //新片
    public static final int CHILDRENS = 2;          //儿童影片
 
    private String title;        //影片名
    // private int priceCode;       //价格码
    // 价格码
    private AbstractPrice abstractPrice;
 
    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }
 
    public String getTitle() {
        return title;
    }
 
    public int getPriceCode() {
        return abstractPrice.getPriceCode();
    }
 
    public void setPriceCode(int arg) {
    	switch (arg) {
    		case REGULAR:
    			this.abstractPrice = new RegularPrice();
    			break;
    		case CHILDRENS:
    			this.abstractPrice = new ChildrensPrice();
    			break;
    		case NEW_RELEASE:
    			this.abstractPrice = new NewReleasePrice();
    			break;
    		default:
    			throw new IllegalArgumentException("Incorrent price code");		
    	}
    }
    
	/**
	 * 计算租赁费用
	 * 
	 * @return double
	 */
	double getCharge(int daysRented) {
		return abstractPrice.getCharge(daysRented);
	}

	/**
	 * 常客积分算法
	 * 
	 * @return int 积分数
	 */
	int getFrequentRenterPoints(int daysRented) {
		return abstractPrice.getFrequentRenterPoints(daysRented);
	}
}
