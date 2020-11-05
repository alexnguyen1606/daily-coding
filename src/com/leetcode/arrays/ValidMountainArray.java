package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>September 10,2020
 */
public class ValidMountainArray {
  public static void main(String[] args) {
    int[] array = {3, 5, 5};
    System.out.println(validMountainArray(array));
  }

  // xác định duy nhất chiều tăng và giảm
  public static boolean validMountainArray(int[] A) {
    if (A == null || A.length < 3) {
      return false;
    }
    boolean isIncreement = true;

    for (int i = 0; (i + 1) < A.length; i++) {
      int j = i + 1;
      if (A[i] > A[j]) {// đang giảm
        if (isIncreement == false) {
          isIncreement = false;
        } else {
          if (i == 0) {
            return false;
          }
          if (isIncreement=true){
            isIncreement = false;
          }
        }
      } else if (A[i] < A[j]) { //đang tăng
        if (isIncreement) {
          if (i == A.length - 1) {
            return false;
          }
          isIncreement= true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
    return !isIncreement;
  }

  public static boolean validMountainArray2(int[] A) {
    if (A == null || A.length < 3) {
      return false;
    }
    int indexMax = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] > A[indexMax]) {
        indexMax = i;
      }
    }
    boolean checkUp = false;
    for (int i = 0; i < indexMax - 1; i++) {
      if (A[i] < A[i + 1]) {
        checkUp = true;
      } else {
        break;
      }
    }
    boolean checkDown = false;
    for (int i = indexMax; i < A.length - 1; i++) {
      if (A[i] > A[i + i]) {
        checkDown = true;
      } else {
        break;
      }
    }
    if (indexMax == 0 || indexMax == A.length - 1) {
      return false;
    }
    return checkDown && checkUp;
  }
}
