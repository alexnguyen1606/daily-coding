package com.dsa_in_90_days.twopointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String convertS = s.toLowerCase();
        int left = 0;
        int right = convertS.length() - 1;
        while (left <= right) {
            char valLeft = convertS.charAt(left);
            if ((valLeft < 'a' || valLeft > 'z') && ( valLeft < '0' || valLeft > '9')) {
                left++;
                continue;
            }
            char valRight = convertS.charAt(right);
            if (((valRight < 'a' || valRight > 'z') && ( valRight < '0' || valRight > '9'))) {
                right--;
                continue;
            }
            if (valRight != valLeft) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
