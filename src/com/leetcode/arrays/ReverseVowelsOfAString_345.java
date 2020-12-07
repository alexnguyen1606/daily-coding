package com.leetcode.arrays;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:22 PM ,December 04,2020
 */
public class ReverseVowelsOfAString_345 {
    // Vowels : UE OAI
    public String reverseVowels(String source) {
        int i = 0;
        int j = source.length() - 1;
        char[] array = source.toCharArray();
        while (i < j) {
            char a = array[i];
            char b = array[j];
            boolean check1 = a == 'u' || a=='e' || a=='o' ||a=='a'|| a=='i' || a == 'U' || a=='E' || a=='O' ||a=='A'|| a=='I';
            boolean check2 = b == 'u' || b=='e' || b=='o' ||b=='a'|| b=='i' || b == 'U' || b=='E' || b=='O' ||b=='A'|| b=='I';
            if (check1 && check2) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if (check1 && check2) {
                i++;
                j--;
            } else if (check1) {
                j--;
            } else {
                i++;
            }
        }
        return new String(array);
        
    }
    
}
