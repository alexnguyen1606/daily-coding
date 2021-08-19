package com.brownbox_online.array;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:03 AM ,August 19,2021
 */
public class PlusOne_66 {
	public static int[] plusOne(int[] digits) {
		int temp;
		int surplus = 0;
		int i = digits.length - 1;
		digits[digits.length - 1] += 1;
		while (i >= 0) {
			temp = surplus + digits[i];
			digits[i] = temp % 10;
			surplus = temp / 10;
			i--;
		}
		if (surplus>0){
			int[] sub = new int[digits.length+1];
			sub[0] = surplus;
			for (int j = 0;j<digits.length;j++){
				sub[j+1] = digits[j];
			}
			digits= sub;
		}

		return digits;
	}

	public static void main(String[] args) {
		int[] array = {9,9};
		array = plusOne(array);
		System.out.println(Arrays.toString(array));
	}
}
