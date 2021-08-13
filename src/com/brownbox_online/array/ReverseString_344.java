package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:33 PM ,August 13,2021
 */
public class ReverseString_344 {
	public void reverseString(char[] s) {
		int i = 0;
		int j = s.length-1;
		while (i<j){
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}

	public void reverseStringRecursive(char[] s){
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
