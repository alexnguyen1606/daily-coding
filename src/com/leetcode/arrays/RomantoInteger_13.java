package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 09,2020
 */
public class RomantoInteger_13 {
    public int romanToInt(String s) {
     int[] array = new int[s.length()];
     char[] arrayChar  = s.toCharArray();
     for (int i =0;i<array.length;i++){
         switch (arrayChar[i]){
             case 'I':
                 array[i] = 1;
                 break;
             case 'V':
                 array[i] = 5;
                 break;
             case 'X':
                 array[i] = 10;
                 break;
             case 'L':
                 array[i] = 50;
                 break;
             case 'C':
                 array[i] = 100;
                 break;
             case 'D':
                 array[i] = 500;
                 break;
             case 'M':
                 array[i] = 1000;
                 break;
         }
     }
     
     return 0;
    }
}
