package com.chapters.sixth.c;
public class exampleA {

	/**
	 * 提炼之前
	 */
	void printOwing() {
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
}