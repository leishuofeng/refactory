/**
 * 
 */
package com.chapters.one.f;

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
		// 总金额
		double totalAmount = 0;
		// 积分点
		int frequentRenterPoints = 0;
		// 用户所有租赁列表
		Enumeration items = rentals.elements();
		String result = getName() + " 的租赁详单如下 :" + "\n";
		// 循环遍历租赁影片，计算消费金额
		while (items.hasMoreElements()) {

			Rental each = (Rental) items.nextElement();			
			//累加租赁影片的积分
			frequentRenterPoints += each.getFrequentRenterPoints();
			
			// 添加详单
			result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();

		}
		// 添加脚注
		result += "总金额为： \t" + String.valueOf(totalAmount) + "\n";
		result += "您本次消费获取： " + String.valueOf(frequentRenterPoints) + " 个积分点";
		return result;
	}
}
