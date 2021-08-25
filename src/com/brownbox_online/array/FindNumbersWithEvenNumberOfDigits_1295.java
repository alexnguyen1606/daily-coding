package com.brownbox_online.array;

/**
 * The type Find numbers with even number of digits 1295.
 * Tìm số lượng các số trong mảng có số độ dài là số chẵn
 *
 * @author:Nguyen Anh Tuan <p> 9:20 AM ,August 06,2021
 */
public class FindNumbersWithEvenNumberOfDigits_1295 {

	// return numbers numerous with length Even
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			int lengthNumber = getLengthOfNumber(num);
			if (lengthNumber % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private int getLengthOfNumber(int number){
		int count = 0;
		while (number>0){
			count++;
			number = number/10;
		}
		return count;
	}

	

}
