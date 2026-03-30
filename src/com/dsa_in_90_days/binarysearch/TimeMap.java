package com.dsa_in_90_days.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Time Based Key-Value Store
public class TimeMap {

    private final Map<String, List<Node>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    // timestamp is strictly increasing, so we can add new node to the end of list
    public void set(String key, String value, int timestamp) {
        Node node = new Node(timestamp, value);
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(node);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        return findValueByTime(map.get(key), timestamp);
    }

    public String findValueByTime(List<Node> array, int timestamp) {
        int left = 0;
        int right = array.size() - 1;

        Integer result = findIndexMostAssociatedTime(array, timestamp, left, right);
        if (result == null) {
            return "";
        }
        return array.get(result).value;
    }

    public Integer findIndexMostAssociatedTime(List<Node> array, int timestamp, int left, int right) {
        if (left > right) {
            return null;
        }
        if (array.get(left).timestamp > timestamp) {
            return null;
        }
        if (array.get(left).timestamp == timestamp) {
            return left;
        }
        if (array.get(right).timestamp <= timestamp) {
            return right;
        }
        int mid = (left + right) / 2;
        if (array.get(mid).timestamp == timestamp) {
            return mid;
        }
        if (array.get(mid).timestamp > timestamp) {
            if (mid + 1 == right) {
                if (timestamp > array.get(left).timestamp) {
                    return findIndexMostAssociatedTime(array, timestamp, left, mid);
                } else {
                    return mid;
                }
            }
            return findIndexMostAssociatedTime(array, timestamp, left, mid + 1);
        } else if (mid == left) {
            return mid;
        }
        return findIndexMostAssociatedTime(array, timestamp, mid, right);
    }


    public static class Node {
        private final Integer timestamp;
        private String value;

        public Node(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

}