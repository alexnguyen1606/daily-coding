package com.dsa_in_90_days.binarysearch;

import java.util.*;

//Time Based Key-Value Store
public class TimeMap {

    private final Map<String, Set<Node>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Node node = new Node(timestamp, value);
        if (!map.containsKey(key)) {
            map.put(key, new TreeSet<>(Comparator.comparing(o -> o.timestamp)));
        }
        map.get(key).add(node);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return null;
        }
        Node[] array = new Node[map.get(key).size()];
        array = map.get(key).toArray(array);
        return findValueByTime(array, timestamp);
    }

    public String findValueByTime(Node[] array, int timestamp) {
        int left = 0;
        int right = array.length - 1;

        Integer result = findIndexMostAssociatedTime(array, timestamp, left, right);
        if (result == null) return "";
        return array[result].value;
    }

    public Integer findIndexMostAssociatedTime(Node[] array, int timestamp, int left, int right) {
        if (left > right) {
            return null;
        }
        if (array[left].timestamp > timestamp) {
            return null;
        }
        if (array[left].timestamp == timestamp) {
            return left;
        }
        if (array[right].timestamp <= timestamp) {
            return right;
        }
        int mid = (left + right) / 2;
        if (array[mid].timestamp == timestamp) {
            return mid;
        }
        if (array[mid].timestamp > timestamp) {
            return findIndexMostAssociatedTime(array, timestamp, left, mid + 1);
        } else
            return findIndexMostAssociatedTime(array, timestamp, mid, right);
    }


    private static class Node {
        private final Integer timestamp;
        private String value;

        public Node(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return timestamp.equals(node.timestamp);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(timestamp);
        }
    }

    public static void main(String[] args) {
        TimeMap map = new TimeMap();
        map.set("foo", "bar", 1);
        map.set("foo", "toliet", 5);
        map.set("foo", "bucket", 10);
        map.set("foo", "bar2", 20);
        System.out.println(map.get("foo", 15));
    }

}