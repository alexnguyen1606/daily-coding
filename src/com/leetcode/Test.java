package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:06 PM ,July 20,2021
 */
public interface Test {
    
    String name ="";

  public static void main(String[] args) {
      Set<Integer> set = new HashSet<>(100);
      for (int i = 0;i<10001 ;i++){
          set.add(i);
      }
    System.out.println(set.size());
  }
}
