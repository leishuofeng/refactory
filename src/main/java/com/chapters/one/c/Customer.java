/**
 * 
 */
package com.chapters.one.c;

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

	// 添加租赁信息
	public void addRental(Rental rental) {
		rentals.addElement(rental);
	}

	// 打印详单方法
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
			// 当前单个租赁金额
			double thisAmount = 0;
			Rental each = (Rental) items.nextElement();

			thisAmount = amountFor(each);
			
			// 每借一张加1个积分点
			frequentRenterPoints++;
			// 积分累加条件：新版本的片子，借的时间大于1天
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
				frequentRenterPoints++;
			}
			// 添加详单
			result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;

		}
		// 添加脚注
		result += "总金额为： \t" + String.valueOf(totalAmount) + "\n";
		result += "您本次消费获取： " + String.valueOf(frequentRenterPoints) + " 个积分点";
		return result;
	}
	
	private double amountFor(Rental aRental){
		double result = 0;
		// 租赁计费规则
		switch (aRental.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			// 普通片，起步价为2元，租期超过2天的部分每天1.5元
			result += 2;
			if (aRental.getDaysRented() > 2) {
				result += (aRental.getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			// 新片，每天3元
			result += aRental.getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			// 儿童片，起步价1.5元，租期超过3天的部分每天1.5元
			result += 1.5;
			if (aRental.getDaysRented() > 3) {
				result += (aRental.getDaysRented() - 3) * 1.5;
			}
			break;
		default:
			break;
		}
		return result;
	}
}
