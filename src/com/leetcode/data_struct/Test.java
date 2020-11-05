package com.leetcode.data_struct;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 *     <p>October 09,2020
 */
public class Test {
  public static void main(String[] args) throws Exception {
    List<Integer> list = new ArrayList<>();
    int x = 3;
    int k = 10;
    for (int i=0;i<100;i++){
      if (i>k){
        k = k + k>>1;
      }
      System.out.println(k);
    }
    
    System.out.println(getCapacity((ArrayList<?>) list));
    for (int i=1;i<=30;i++){
      list.add(i);
      System.out.println(i);
      System.out.println("size:"+list.size());
      System.out.println("capacity:"+getCapacity((ArrayList<?>) list));
    }
    System.out.println("size:"+list.size());
    System.out.println("capacity:"+getCapacity((ArrayList<?>) list));
    
   
  }
  static int getCapacity(ArrayList<?> l) throws Exception {
    Field dataField = ArrayList.class.getDeclaredField("elementData");
    dataField.setAccessible(true);
    return ((Object[]) dataField.get(l)).length;
  }
}
