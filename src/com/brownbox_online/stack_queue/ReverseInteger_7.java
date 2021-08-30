package com.brownbox_online.stack_queue;

import java.util.LinkedList;

/**
 * @author:Nguyen Anh Tuan
 *     <p>11:04 PM ,August 27,2021
 */
public class ReverseInteger_7 {
  public int reverse(int x) {
  	if (x==0){
  		return 0;
    }
    LinkedList<Integer> stack = new LinkedList<>();
    int check = 1;
    if (x < 0) {
      check = -1;
    }
    while (x != 0) {
      stack.push(Math.abs(x % 10));
      x /= 10;
    }
    StringBuilder builder = new StringBuilder();
    while (!stack.isEmpty()) {
      builder.append(stack.pollLast());
    }
    int value = 0;
    try{
    	value = Integer.valueOf(builder.toString()) * check;
    }catch (Exception e){
    	return 0;
    }
    return  value;
  }
}
