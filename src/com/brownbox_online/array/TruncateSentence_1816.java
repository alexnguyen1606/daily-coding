package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:25 PM ,August 23,2021
 */
public class TruncateSentence_1816 {
	public String truncateSentence(String s, int k) {
		String[] arrayStr = s.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i=0;i<k;i++){
			result.append(arrayStr[i]);
			result.append(" ");
			
		}
		return result.toString().trim();
	}
}
