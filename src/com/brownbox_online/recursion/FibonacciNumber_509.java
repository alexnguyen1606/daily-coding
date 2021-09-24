package com.brownbox_online.recursion;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:31 AM ,September 12,2021
 */
public class FibonacciNumber_509 {

	public int fibonaci(int n){
		int[] array = new int[40];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2;i<array.length;i++){
			array[i] = array[i-1]+array[i-2];
		}
		return array[n];
	}

}
