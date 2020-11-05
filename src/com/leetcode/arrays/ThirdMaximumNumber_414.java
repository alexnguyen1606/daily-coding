package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 09,2020
 */
public class ThirdMaximumNumber_414 {
  public static void main(String[] args) {

  }

  public int thirdMax(int[] array){
      Long[] arrayMax = {Long.MIN_VALUE,Long.MAX_VALUE,Long.MIN_VALUE};

      for (int i=0;i<array.length;i++){
          int value = array[i];
          insert(arrayMax,value);

      }
      if (arrayMax[2]==Long.MIN_VALUE){
          return Math.toIntExact(arrayMax[0]);
      }
      return Math.toIntExact(arrayMax[2]);
  }

  public void insert(Long[] array ,int item){
      int i = 0;
      while (i<array.length){
          if (item==array[i]){
              return;
          }else if (item>array[i]){

          }else {
              i++;
          }
      }
  }

  public void sort(int[] array) {
    int length = array.length;
    for (int i = 1; i < length; i++) {
      int value = array[i];
      int j = i - 1;
      while (j >= 0 && value < array[j]) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = value;
    }
  }
}
