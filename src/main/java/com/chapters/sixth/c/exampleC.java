package com.chapters.sixth.c;
public class exampleC {

	/**
	 * 如果 outStanding 变量在初始化时就做了一些其他特殊操作，如下例子，
	 * 就可以将outStanding当做一个参数，传递给提炼代码段
	 */
	void printOwing(double previousAmount) {
		printBanner();
		double outStanding = getOutStanding(previousAmount * 12);
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
	double getOutStanding(double initialValue) {
		double result = initialValue;
		Enumeration e = _orders.elements();
		// calculate outStanding
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}
}