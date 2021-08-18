package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:32 PM ,August 18,2021
 */
public class LargestNumberAtLeastTwiceofOthers_747 {
  public static int dominantIndex(int[] nums) {
    if (nums == null || nums.length == 1) {
      return 0;
    }
    int maxIndex = 0;
    int secondIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[maxIndex]) {
        maxIndex = i;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (maxIndex == secondIndex && nums[i] < nums[secondIndex]) {
        secondIndex = i;
      } else {
        if (nums[i] > nums[secondIndex] && i != maxIndex) {
          secondIndex = i;
        }
      }
    }
    if (nums[secondIndex] == 0) {
      return maxIndex;
    }
    int dive = nums[maxIndex] / nums[secondIndex];
    return dive >= 2 ? maxIndex : -1;
  }

  public static int[] mergeSort(int[] nums, int L, int R) {
    if (L == R) {
      return new int[] {nums[L]};
    }
    int mid = (L + R) / 2;
    int[] leftArray = mergeSort(nums, L, mid - 1);
    int[] rightArray = mergeSort(nums, mid, R);
    return merge(leftArray, rightArray);
  }

  private static int[] merge(int[] leftArray, int[] rightArray) {
    int[] mergedArray = new int[leftArray.length + rightArray.length];
    int iLeft = 0;
    int iRight = 0;
    int iMergedArray = 0;
    while (iLeft < leftArray.length || iRight < rightArray.length) {
      if (iLeft < leftArray.length && iRight < rightArray.length) {
        if (leftArray[iLeft] < rightArray[iRight]) {
          mergedArray[iMergedArray] = leftArray[iLeft];
          iLeft++;
        } else {
          mergedArray[iMergedArray] = rightArray[iRight];
          iRight++;
        }
      } else if (iLeft < leftArray.length) {
        mergedArray[iMergedArray] = leftArray[iLeft];
        iLeft++;
      } else {
        mergedArray[iMergedArray] = rightArray[iRight];
        iRight++;
      }
      iMergedArray++;
    }
    return mergedArray;
  }

  public static void main(String[] args) {
    int[] a = {1, 0};
    System.out.println(dominantIndex(a));
  }
}
