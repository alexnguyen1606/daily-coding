package com.brownbox_online.array.sorts;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 6:29 PM ,August 18,2021
 */
public class HeightCheck_1051 {
	public static int heightChecker(int[] heights) {
		int count = 0;
		int[] copiedArray = Arrays.copyOf(heights,heights.length);
		sort(heights,0,heights.length-1);
		for (int i =0;i<heights.length;i++){
			if (heights[i] != copiedArray[i]){
				count++;
			}
		}
		return count;
	}
	
	public static void sort(int[] array,int L,int R){
		if (L>=R){
			return;
		}
		int key = array[(L+R)/2];
		int pivot = pivot(array,L,R,key);
		sort(array,L,pivot-1);
		sort(array,pivot,R);
	}
	
	
	public static int pivot(int[] array,int L, int R, int key){
		while (L>=R){
			while (array[L] < key){
				L++;
			}
			while (array[R] > key){
				R--;
			}
			if (L>=R){
				int temp = array[L];
				array[L] = array[R];
				array[R] = temp;
				R--;
				L++;
			}
		}
		return L;
	}
	
  public static void main(String[] args) {
	  int[] array = {5,1,2,3,4};
    System.out.println(heightChecker(array));
    System.out.println(Arrays.toString(array));
  }
}
