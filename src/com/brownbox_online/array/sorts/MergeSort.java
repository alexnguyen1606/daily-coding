package com.brownbox_online.array.sorts;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:47 PM ,August 11,2021
 */
public class MergeSort extends BaseSort {
    public static int[] sortArray(int[] array) {
        return mergeSort(array,0,array.length-1);
    }
    
    public static int[] mergeSort(int[] array, int L, int R){
        // chia mảng đến khi không thể chia được nữa khi đó mang coi như đã được sắp xếp tăng dần
        // Chia đến khi mảng còn 1 phần từ thì không chia được nữa
        if (L==R){
            return new int[]{array[L]};
        }
        int mid = (L+R)/2;
        int[] arrayLeft = mergeSort(array,L,mid);
        int[] arrayRight = mergeSort(array,mid+1,R);
        
        // Chộn 2 mảng
        return mergeToSortedArray(arrayLeft,arrayRight);
    }
    
    // Chộn 2 mảng đã sắp xếp theo chiều tăng dần
    public static int[] mergeToSortedArray(int[] arrayFirst,int[] arraySecond){
        int lengthArrayFirst = arrayFirst.length;
        int lengthArraySecond = arraySecond.length;
        int n = lengthArrayFirst+lengthArraySecond;
        int[] arrayResult = new int[n];
        int i = 0,j = 0,k=0;
        while (i<n){
            if (j < lengthArrayFirst && k < lengthArraySecond){
                if (arrayFirst[j] > arraySecond[k]){
                    arrayResult[i] = arraySecond[k];
                    k++;
                }else {
                    arrayResult[i] = arrayFirst[j];
                    j++;
                }
            }else if (j<lengthArrayFirst){
                arrayResult[i] = arrayFirst[j];
                j++;
            }else {
                arrayResult[i] = arraySecond[k];
                k++;
            }
            i++;
        }
        return arrayResult;
    }

  public static void main(String[] args) {
    int[] array = {1,2,43,5,12,5,6,3};
    array = sortArray(array);
    print(array);
  }
}
