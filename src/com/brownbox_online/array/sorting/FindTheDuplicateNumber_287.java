package com.brownbox_online.array.sorting;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:52 PM ,September 11,2021
 */
public class FindTheDuplicateNumber_287 {

  public int findDuplicate(int[] nums) {
    int[] sortedArray = sort(nums, 0, nums.length - 1);
    for (int i = 0;i<sortedArray.length-1;i++){
    	if (sortedArray[i]==sortedArray[i+1]){
    		return sortedArray[i];
	    }
    }
    return -1;
  }

  private int[] sort(int[] nums, int L, int R) {
    if (L == R) {
      return new int[] {nums[L]};
    }
    int middle = (L + R) / 2;
    int[] leftArray = sort(nums, L, middle);
    int[] rightArray = sort(nums, middle + 1, R);
    return mergeSortedArray(leftArray, rightArray);
  }

  private int[] mergeSortedArray(int[] leftArray, int[] rightArray) {
    int[] mergedArray = new int[leftArray.length + rightArray.length];
    int i = 0, j = 0, k = 0;
    while (k < mergedArray.length) {
      if (i < leftArray.length && j < rightArray.length) {
      	if (leftArray[i]<rightArray[j]){
      		mergedArray[k] = leftArray[i];
      		i++;
        }else {
      		mergedArray[k] = rightArray[j];
      		j++;
        }
      }else if (i<leftArray.length){
	      mergedArray[k] = leftArray[i];
	      i++;
      }else {
	      mergedArray[k] = rightArray[j];
	      j++;
      }

      k++;
    }

    return mergedArray;
  }
}
