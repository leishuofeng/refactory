/**
 * 
 */
package com.chapters.sixth.extractMethod.b;

import java.util.Enumeration;

/**
 * @ClassName: exampleA
 * @Description:TODO(有局部变量，使用extract method)
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
	
	// **************************************************
	// ***************     提炼局部变量        ********************
	// **************************************************
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
		// 有局部变量，当做参数传递给目标函数，并不改变其值
		printDetails(_name,outStanding);
		
	}

	// 提取打印详情部分
	// 被提取的代码段只是读取这些变量，并不改变这些变量的值，这种情况，将变量当做参数传递给目标函数即可
	void printDetails(String name,double outStanding) {
		// print details
		System.out.println("name =" + name);
		System.out.println("outStanding = " + outStanding);
	}
}
