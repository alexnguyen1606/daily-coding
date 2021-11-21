package com.brownbox_online.array.sorting;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 8:11 AM ,August 12,2021
 */
public class Test {
	public static void main(String[] args) {
		int[] array = {1,2,43,21,2,4,5};
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		int temp;
		boolean isSorted;
		for (int i = 0; i < n; i++) {
			isSorted = true;
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}

	public static void insertionSort(int[] array) {
		int n = array.length;
		int j, value;
		for (int i = 1; i < n; i++) {
			j = i - 1;
			value = array[i];
			while (j >= 0 && value < array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = value;
		}
	}

	public static void selectionSort(int[] array){
		int n = array.length;
		int index,j;
		for (int i = 0;i<n-1;i++){
			index = i;
			j = i+1;
			while (j<n){
				if (array[index] > array[j]){
					index = j;
				}
				j++;
			}
			if ( index != i){
				int temp = array[index];
				array[index] = array[i];
				array[i] = temp;
			}
		}
	}

	public static int[] mergeSort(int[] array,int L, int R){
		if (L==R){
			return new int[]{array[L]};
		}
		int middle =(R+L)/2;
		int[] leftArray = mergeSort(array,L,middle);
		int[] rightArray = mergeSort(array,middle+1,R);
		int[] result = new int[rightArray.length+leftArray.length];
		int i=0,j=0,k=0;
		while (i<result.length){
			if (j<leftArray.length && k<rightArray.length){
				if (leftArray[j] > rightArray[k]){
					result[i] = rightArray[k];
					k++;
				}else {
					result[i] = leftArray[j];
					j++;
				}
			}else if (j<leftArray.length){
				result[i] = leftArray[j];
				j++;
			}else {
				result[i] = rightArray[k];
				k++;
			}
			i++;
		}
		return result;
	}

	public static void quickSort(int[] array, int L, int R){
		if (L >= R){
			return;
		}
		int key = array[(R+L)/2];
		int pivot = pivot(array,L,R,key);
		quickSort(array,L,pivot-1);
		quickSort(array,pivot,R);
	}

	public static int pivot(int[] array,int L, int R,int key){
		int iL = L;
		int iR = R;
		int temp;
		while (iL <= iR){
			while (array[iR] > key){
				iR--;
			}
			while (array[iL] < key){
				iL++;
			}
			if (iL<=iR){
				temp= array[iL];
				array[iL] =  array[iR];
				array[iR] = temp;
				iL++;
				iR--;
			}
		}
		return iL;
	}
}
