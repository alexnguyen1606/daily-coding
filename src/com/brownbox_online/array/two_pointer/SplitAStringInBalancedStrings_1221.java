package com.brownbox_online.array.two_pointer;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:34 PM ,August 23,2021
 */
public class SplitAStringInBalancedStrings_1221 {
	public int balancedStringSplit(String s) {
		int count = 0;
		int countL = 0;
		int countR = 0;
		for (int i = 0;i<s.length();i++){
			if (s.charAt(i)=='L'){
				countL++;
			}else {
				countR++;
			}
			if (countL==countR){
				count++;
			}
		}
		return count;
	}
}
