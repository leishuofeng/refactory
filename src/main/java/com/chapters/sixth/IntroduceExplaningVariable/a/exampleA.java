package com.chapters.sixth.IntroduceExplaningVariable.a;

public class exampleA {
	final String platform = "";
	final String browser = "";
	final Integer resize = 1;
	
	
	public void changeBefore() {
		if(platform.toUpperCase().indexOf("MAC") > -1 && 
				browser.toUpperCase().indexOf("IE") > -1 &&
				resize > 0
				) {
			// do something
		}
	}
	
	// 上述代码中 判断条件中的表达式看起来十分复杂，并且不易理解
	// 将上述代码中的复杂表达式提取出来，引入解释型的boolean变量
	// 在下面的判断语句中，我们就能清晰的读懂这段代码究竟是在做什么
	
	public void changeAfter() {
		boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1 ;
		boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
		boolean wasResized = resize > 0 ;
		
		if(isMacOs && isIEBrowser && wasResized) {
			// do something
		}
	}
}
