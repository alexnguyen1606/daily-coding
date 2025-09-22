package com.datastucture;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            count.putIfAbsent(value, 0);
            count.put(value, count.get(value) + 1);
        }
        List<Integer>[] bucketSort = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            List<Integer> numberId = bucketSort[entry.getValue()];
            if (numberId == null) {
                numberId = new ArrayList<>();
                bucketSort[entry.getValue()] = numberId;
            }
            numberId.add(entry.getKey());
        }

        int[] rs = new int[k];
        int j = bucketSort.length - 1;
        int h = k - 1;
        while (h >= 0 && j >= 0) {
            List<Integer> numbers = bucketSort[j];
            if (numbers == null) {
                j--;
                continue;
            }
            for (int z = 0; z < numbers.size() && h >= 0 ; z++) {
                rs[h] = numbers.get(z);
                h--;
            }
            j--;
        }
        return rs;
    }



}
