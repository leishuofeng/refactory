package com.chapters.sixth.splitTemporaryVariable;

public class Example {
	double mass  = 20.0;
	double primaryForce = 10.0;
	double secondaryForce = 20.0;
	int delay = 2;
	
	/**
	 * 计算苏格兰布丁运动的距离
	 * 1. 在起点处，静止的苏格兰布丁受到一个初始力的作用而开始运动
	 * 2. 一段时间之后，第二个力作用于布丁，让它再次加速
	 * @param time
	 * @return
	 */
	double getDistanceTravelled(int time) {
		double result;
		double acc = primaryForce / mass ;
		int primaryTime = Math.min(time, delay);
		result  = 0.5 * acc * primaryTime * primaryTime;
		int secondaryTime = time - delay;
		if(secondaryTime > 0) {
			double primaryVel = acc * delay;
			acc = ( primaryForce + secondaryForce) / mass;
			result += primaryVel * secondaryTime + 0.05 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}
	
	double getDistanceTravelledAfter(int time) {
		double result;
		final double primaryAcc = primaryForce / mass ;
		int primaryTime = Math.min(time, delay);
		result  = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time - delay;
		if(secondaryTime > 0) {
			double primaryVel = primaryAcc * delay;
			final double secondaryAcc = ( primaryForce + secondaryForce) / mass;
			result += primaryVel * secondaryTime + 0.05 * secondaryAcc * secondaryTime * secondaryTime;
		}
		return result;
	}
}
