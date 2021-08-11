package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:48 AM ,August 06,2021
 */
public class MergeSortedArray_88 {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int value : nums2) {
      insertToArray(nums1, m, value);
      m++;
    }
  }

  public static void mergeWithTwoPointer(int[] nums1, int m, int[] nums2, int n) {
    int[] temp = new int[m];
    if (m >= 0) System.arraycopy(nums1, 0, temp, 0, m);
    int i = 0;
    int j = 0;
    int k = 0;
    while (i > m || j > n) {
      if (i >= 0 && j >= 0) {
        if (temp[i] > nums2[j]) {
          nums1[k] = nums2[j];
          j++;
        } else {
          nums1[k] = temp[i];
          i++;
        }
      } else if (i >= 0) {
        nums1[k] = temp[i];
        i++;
      } else {
        nums1[k] = nums2[j];
        j++;
      }
      k++;
    }
  }

  public static void mergeWithTwoPointerType2(int[] nums1, int m, int[] nums2, int n) {
    int i = m-1;
    int j = n-1;
    int k = nums1.length-1;
    while (k>=0){
    	if (i >=0 && j>=0){
    		if (nums1[i] >= nums2[j]){
    			nums1[k] = nums1[i];
    			i--;
			}else {
    			nums1[k] = nums2[j];
    			j--;
			}
		}else if (i>=0){
			nums1[k] = nums1[i];
			i--;
		}else {
			nums1[k] = nums2[j];
			j--;
		}
    	k--;
	}
  }

  private static void reverse(int[] array) {
    int i = 0;
    int j = array.length - 1;
    while (i < j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
      i++;
      j--;
    }
  }

  private static void insertToArray(int[] array, int length, int value) {
    for (int i = 0; i < length; i++) {
      if (array[i] > value) {
        insertToIndex(array, length, i + 1, value);
        return;
      }
    }
    array[length] = value;
  }

  private static void insertToIndex(int[] array, int length, int index, int value) {
    if (index == -1 || index >= array.length) {
      return;
    }
    for (int i = length - 1; i >= index; i--) {
      array[i + 1] = array[i];
    }
    array[index] = value;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 0, 0, 0};
    int[] b = {2, 5, 6};
    merge(a, 3, b, 3);
    for (int x : a) {
      System.out.println(x);
    }
  }
}
