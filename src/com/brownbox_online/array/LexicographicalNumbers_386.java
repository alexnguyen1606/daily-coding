package com.brownbox_online.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:11 PM ,August 23,2021
 */
public class LexicographicalNumbers_386 {
	public List<Integer> lexicalOrder(int n) {
		List<String> listString = new ArrayList<>(n);
		for (int i=1;i<=n;i++){
			listString.add(String.valueOf(i));
		}
		Collections.sort(listString);
		List<Integer> result = new ArrayList<>(listString.size());
		for (String value : listString){
			result.add(Integer.valueOf(value));
		}
		return result;
	}
}
