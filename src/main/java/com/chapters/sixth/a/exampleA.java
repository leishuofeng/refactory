/**
 * 
 */
package com.chapters.sixth.a;

import java.util.Enumeration;

/**
 * @ClassName: exampleA
 * @Description:TODO(无局部变量，使用extract method)
 * @author: leishuofeng@aliyun.com
 * @date: 2019年1月9日
 */
public class exampleA {

	/**
	 * 提炼之前
	 */
	void printOwingBefore() {
		Enumeration e = _orders.elements();
		double outStanding = 0.0;

		// print banner
		System.out.println("********************************");
		System.out.println("**********Customers Owes********");
		System.out.println("********************************");

		// calculate outStanding
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outStanding += each.getAmount();
		}

		// print details
		System.out.println("name =" + _name);
		System.out.println("outStanding = " + outStanding);
	}

	// 我们可以轻松提炼出 “打印横幅的代码”， 我们只需要剪切、粘贴、再插入一个函数调用动作就行了

	void printOwingAfter() {
		Enumeration e = _orders.elements();
		double outStanding = 0.0;
		
		// 无局部变量，被抽取成一个打印函数，通过调用方法的手法，使程序结构更加清晰
		printBanner();

		// calculate outStanding
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outStanding += each.getAmount();
		}

		// print details
		System.out.println("name =" + _name);
		System.out.println("outStanding = " + outStanding);
	}

	/**
	 * 被抽取的打印横幅
	 */
	void printBanner() {
		// print banner
		System.out.println("********************************");
		System.out.println("**********Customers Owes********");
		System.out.println("********************************");
	}
}
