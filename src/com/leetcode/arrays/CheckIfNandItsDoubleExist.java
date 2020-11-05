package com.leetcode.arrays;

import java.util.LinkedList;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * September 10,2020
 */
public class CheckIfNandItsDoubleExist {
  public static void main(String[] args) {
    int[] array = {-20,8,-6,-14,0,-19,14,4};
    System.out.println(checkExitsDoubleN(array));
  }

    public static boolean checkExitsDoubleN(int[] array ){

        if (array==null || array.length==0){
            return false;
        }
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]==2*array[j] || 2*array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
