package com.dsa_in_90_days.hashmap;

import com.brownbox_online.heap.MaxHeap;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequencyInArray {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (Integer value : nums) {
            counter.put(value, counter.getOrDefault(value, 0) + 1);
        }
        List<Node> nodes = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
        nodes = nodes.stream()
                .sorted((o1, o2) -> o2.frequency.compareTo(o1.frequency))
                .collect(Collectors.toList());
        int i = 0;
        int[] rs = new int[k];
        while (i < k) {
            if (nodes.size() < i) {
                break;
            }
            rs[i] = nodes.get(i).value;
            i++;
        }
        return rs;
    }

    public static class Node {
        Integer value;
        Integer frequency;

        public Node(Integer value, Integer frequency) {
            this.value = value;
            this.frequency = frequency;
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Node)) {
                return false;
            }
            return value.equals(((Node) obj).value);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,1,2,1,2,3,1,3,2};
        int[] rs = topKFrequent(array,2);
        System.out.println(rs);
    }

}
