package com.brownbox_online.array.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:09 AM ,October 03,2021
 */
public class ContainsDuplidate_217 {

  public boolean containsDuplicate(int[] nums) {
    int[] temp = mergeSort(nums, 0, nums.length - 1);
    
	for (int i = 0; i < temp.length - 1; i++) {
		if (temp[i] == temp[i + 1]) {
			return true;
		}
	}
    return false;
  }

  private int[] mergeSort(int[] nums, int L, int R) {
    if (L == R) {
      return new int[] {nums[L]};
    }

    int middle = (L + R) / 2;
    int[] leftArray = mergeSort(nums, L, middle);
    int[] rightArray = mergeSort(nums, middle + 1, R);

    return mergeSorted(leftArray, rightArray);
  }

  private int[] mergeSorted(int[] leftArray, int[] rightArray) {
    int[] combineArray = new int[leftArray.length + rightArray.length];
    int i = 0;
    int j = 0;
    int k = 0;
    Arrays.sort(combineArray);
    while (k < combineArray.length) {

      if (i < leftArray.length && j < rightArray.length) {
        if (leftArray[i] < rightArray[j]) {
          combineArray[k] = leftArray[i];
          i++;
        } else {
		  combineArray[k] = rightArray[j];
		  j++;
        }
      } else if (i < leftArray.length) {
	      combineArray[k] = leftArray[i];
	      i++;
      } else {
	      combineArray[k] = rightArray[j];
	      j++;
      }
      k++;
    }

    return combineArray;
  }
}
