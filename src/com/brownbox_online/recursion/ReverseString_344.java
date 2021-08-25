package com.brownbox_online.recursion;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:22 AM ,August 26,2021
 */
public class ReverseString_344 {
	public void reverseString(char[] s){
		swap(s,0,s.length-1);
	}
	
	public void swap(char[] s, int i, int j){
		if (i>=j){
			return;
		}
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		swap(s,++i,--j);
	}
}
