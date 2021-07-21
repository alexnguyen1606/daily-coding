package com.sorts;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 9:14 AM ,May 21,2021
 */
public class BubbleSort extends CommonSort{

  public static void main(String[] args) {
	  BubbleSort bubbleSort = new BubbleSort();
	  int[] array = new int[]{2,3,5,1,3,2,9,120,2,4,5,2,6,10};
	  long start = System.currentTimeMillis();
	  bubbleSort.sortOptimize(array);
	  long end = System.currentTimeMillis();
    System.out.println(end-start);
	//  bubbleSort.print(array);
  }

	@Override
	public void sort(int[] array) {
  	int n = array.length;
		for (int i =0;i< n;i++){
			for (int j=0;j<n-1;j++){
				if (array[j]>array[j+1]){
					swap(array,j,j+1);
				}
				print(array);
			}
		}
	}

	public void sortOptimize(int[] array){
		int n = array.length;
		for (int i =0;i< n;i++){
			boolean isSorted = true;
			for (int j=0;j<n-1;j++){
				if (array[j]>array[j+1]){
					isSorted = false;
					swap(array,j,j+1);
				}
				print(array);
			}
			if (isSorted){
				break;
			}
		}
	}
}
