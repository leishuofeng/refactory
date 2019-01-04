package com.chapters.one;

/**   
 * @ClassName:  test   
 * @Description:TODO(电影类)   
 * @author: leisf@saiwish.com 
 * @date:   2019年1月4日 下午2:09:17   
 *     
 * @Copyright: 2019 www.sailwish.com Inc. All rights reserved.  
 */
public class Movie {

    public static final int REGULAR = 0;            //普通影片
    public static final int NEW_RELEASE = 1;        //新片
    public static final int CHILDRENS = 2;          //儿童影片
 
    private String title;        //影片名
    private int priceCode;       //价格码
 
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
 
    public String getTitle() {
        return title;
    }
 
    public int getPriceCode() {
        return priceCode;
    }
 
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
