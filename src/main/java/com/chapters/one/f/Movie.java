package com.chapters.one.f;

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
