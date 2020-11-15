package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * November 09,2020
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                map.replace(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for (Map.Entry<Integer,Integer> item : map.entrySet()){
            if (item.getValue()==1){
                return item.getKey();
            }
        }
        return -1;
    }
}
