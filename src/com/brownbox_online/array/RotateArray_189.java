package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 *     <p>9:34 PM ,September 19,2021
 */
public class RotateArray_189 {
  public void rotate(int[] nums, int k) {
    int timeRotate = k % nums.length;
    int[] temp = new int[timeRotate];
    int j = 0;
    for (int i = nums.length - timeRotate; i < nums.length; i++, j++) {
      temp[j] = nums[i];
    }
    j = nums.length - timeRotate - 1;
    int i = nums.length - 1;
    while (j >= 0) {
      nums[i] = nums[j];
      j--;
      i--;
    }
    for (i = 0; i < timeRotate; i++) {
      nums[i] = temp[i];
    }
  }

  public static void main(String[] args) {
    int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
    RotateArray_189 rotateArray = new RotateArray_189();
    rotateArray.rotate(array, 3);
    String abc = "";
    
  }
}
