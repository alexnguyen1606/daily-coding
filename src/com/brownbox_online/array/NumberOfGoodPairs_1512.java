package com.brownbox_online.array;

import java.util.*;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:04 AM ,August 18,2021
 */
public class NumberOfGoodPairs_1512 {
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        Set<Integer> unique;
        for (int i = 0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else {
                unique = new HashSet<>();
                unique.add(i);
                map.put(nums[i],unique);
            }
        }
        int count = 0;
        for (Map.Entry<Integer,Set<Integer>> set : map.entrySet()){
            count += count(set.getValue().size()-1);
        }
        return count;
    }
    
    public static int count(int n){
        int count = 0;
        while (n>=0){
            count+= n;
            n--;
        }
        return count;
    }

  public static void main(String[] args) {
    int[] array = {1,2,3,1,1,3};
    System.out.println(numIdenticalPairs(array));
  }
}
