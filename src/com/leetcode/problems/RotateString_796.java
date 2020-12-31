package com.leetcode.problems;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:01 AM ,December 25,2020
 */
public class RotateString_796 {
    public boolean rotateString(String A, String B) {
        char [] aChars = A.toCharArray();
        char [] bChars = B.toCharArray();
        if(aChars.length ==0 && bChars.length == 0) return true;
        if(aChars.length != bChars.length) return false;
        
        
        for(int i=0; i < aChars.length; i++ ){
            if(aChars[i] == bChars[0]){
                
                if( A.substring(i, aChars.length).equals(B.substring(0, aChars.length -i)) &&
                            A.substring(0,i).equals( B.substring(aChars.length-i, bChars.length)))
                    
                    return true;
            }
        }
        
        return false;
    }
}
