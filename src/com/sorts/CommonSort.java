package com.sorts;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:17 AM ,May 21,2021
 */
public abstract class CommonSort {

	public void print(int[] array){
		for (int value : array) {
			System.out.print(value+" ");
		}
    System.out.println();
	}

	public void swap(int[] array,int indexSouce,int indexDes){
		int temp = array[indexSouce];
		array[indexSouce] = array[indexDes];
		array[indexDes] = temp;
	}

	public abstract void sort(int[] array);

}
