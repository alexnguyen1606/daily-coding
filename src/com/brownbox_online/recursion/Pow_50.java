package com.brownbox_online.recursion;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:43 PM ,August 27,2021
 */
public class Pow_50 {
	public double myPow(double x, int n) {
		if (n==0 || x==1){
			return 1;
		}
		double powX = x;
		for (int i = 1;i<=Math.abs(n);i++){
			powX*=x;
		}
		if (n<0){
			return 1/powX;
		}
		return powX;
	}
	
	
}
