package com.brownbox_online.array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:48 PM ,August 23,2021
 */
public class ReplaceWords_648 {
	public String replaceWords(List<String> dictionary, String sentence) {
		String[] arrayString = sentence.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		Set<String> set = new HashSet<>();
		for (String value : dictionary){
			set.add(value);
		}
		for (int i = 0;i<arrayString.length;i++){
			for (int j = 0;j<arrayString[i].length();j++){
				String prefix = arrayString[i].substring(0,j+1);
				if (set.contains(prefix)){
					arrayString[i] = prefix;
					break;
				}
			}
			if (i==0){
				stringBuilder.append(arrayString[i]);
			}else {
				stringBuilder.append(" ");
				stringBuilder.append(arrayString[i]);
			}
		}
		
		return stringBuilder.toString();
	}
}
