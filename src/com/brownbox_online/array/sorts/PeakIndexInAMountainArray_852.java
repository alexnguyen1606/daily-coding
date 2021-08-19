package com.brownbox_online.array.sorts;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:14 PM ,August 19,2021
 */
public class PeakIndexInAMountainArray_852 {
	public int peakIndexInMountainArray(int[] arr) {
		return searchMaxIndex(arr,0, arr.length-1);
	}

	public static int searchMaxIndex(int[] array,int L,int R){
		if (L>R){
			return -1;
		}
		int mid =L + (R-L)/2;
		if (array[mid] > array[mid-1] && array[mid]>array[mid+1]){
			return mid;
		}
		if (array[mid] >= array[mid-1]){
			return searchMaxIndex(array,mid,R);
		}else {
			return searchMaxIndex(array,L,mid);
		}
	}

	public static void main(String[] args) {
		int[] array = {0,0,0,0,1,0,0};
		System.out.println(searchMaxIndex(array,0,array.length-1));
	}
}
