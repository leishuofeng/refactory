/**
 * 
 */
package com.chapters.one.g;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName: Customer
 * @Description:TODO(顾客类)
 * @author: leishuofeng@aliyun.com
 * @date: 2019年1月4日 
 * 
 */
public class Customer {

	/**
	 * @Fields name : TODO(名称)
	 */
	private String name;

	/**
	 * @Fields rentals : TODO(租赁列表)
	 */
	private Vector rentals = new Vector();

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	/**
	 * 添加影片
	 * @param rental
	 */
	public void addRental(Rental rental) {
		rentals.addElement(rental);
	}

	/**
	 * 打印详单方法
	 * @return
	 */
	public String statement() {
		// 用户所有租赁列表
		Enumeration items = rentals.elements();
		String result = getName() + " 的租赁详单如下 :" + "\n";
		// 循环遍历租赁影片，计算消费金额
		while (items.hasMoreElements()) {
			Rental each = (Rental) items.nextElement();						
			// 添加详单
			result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		// 添加脚注
		result += "总金额为： \t" + String.valueOf(getTotalCharge()) + "\n";
		result += "您本次消费获取： " + String.valueOf(getTotalfrequentRenterPoints()) + " 个积分点";
		return result;
	}
	
	/**
	 * 直接计算总金额
	 * @return
	 */
	private double getTotalCharge() {
		// 提取 statement 方法中的 totalAmount 临时变量
		// totalAmount 是表示总金额，这里的方法直接计算出总金额 返回
		// replace temp with query 利用查询函数来替代临时变量
		double result = 0;
		Enumeration rental = rentals.elements();
		while (rental.hasMoreElements()) {
			Rental each = (Rental) rental.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	/**
	 *  计算积分点
	 * @return
	 */
	private int getTotalfrequentRenterPoints() {
		// 和 抽取 totalAmount 方法一样的手法，抽取 临时变量 frequentRenterPoints
		// 由于 frequentRenterPoints 在循环内部被赋值，
		// 我们不得不把 循环搬移到查询函数中
		int result = 0;
		Enumeration items = rentals.elements();
		while (items.hasMoreElements()) {
			Rental each = (Rental) items.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
