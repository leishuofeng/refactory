package com.chapters.sixth.extractMethod.c;
public class exampleB {

	/**
	 * 提炼之前
	 */
	void printOwing() {
		// print banner
		printBanner();
		// calculate outStanding
		double outStanding = getOutStanding();
		// print details
		printDetails(_name,outStanding);
	}
	
	void printBanner() {
		System.out.println("********************************");
		System.out.println("**********Customers Owes********");
		System.out.println("********************************");
	}
	
	void printDetails(String _name,double outStanding) {
		System.out.println("name =" + _name);
		System.out.println("outStanding = " + outStanding);
	}
	
	// 提取计算部分的代码
	// 计算部分代码对局部变量有赋值操作，
	// e 变量只在被提炼的代码段中使用，所以讲声明部分也一并提炼
	// double outStanding 变量被函数内外都使用了，所以用提炼出来的新函数返回他
	double getOutStanding() {
		Enumeration e = _orders.elements();
		double outStanding = 0.0;
		// calculate outStanding
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outStanding += each.getAmount();
		}
		return outStanding;
	}
}