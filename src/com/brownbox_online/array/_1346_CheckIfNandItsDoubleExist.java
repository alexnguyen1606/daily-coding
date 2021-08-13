package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:52 PM ,August 13,2021
 */
public class _1346_CheckIfNandItsDoubleExist {
	public boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (i!=j && (arr[i] % arr[j] * 2 == 0) || (arr[j] % arr[i] * 2 == 0) && i != j) {
					return true;
				}
			}
		}
		return false;
	}
}
