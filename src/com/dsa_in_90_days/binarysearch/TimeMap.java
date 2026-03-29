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

    private String findValueByTime(Node[] array, int timestamp) {
        int left = 0;
        int right = array.length - 1;

        int result = 0;
        while (left <= right && left >= 0) {
            if (array[left].timestamp > timestamp) {
                return "";
            }
            if (array[left].timestamp == timestamp) {
                result = left;
                break;
            }
            if (array[right].timestamp <= timestamp) {
                result = right;
                break;
            }
            int mid = (left + right) / 2;
            if (array[mid].timestamp == timestamp) {
                result = mid;
                break;
            }
            if (array[mid].timestamp > timestamp) {
                right = mid + 1;
            } else if (array[mid].timestamp < timestamp) {
                left = mid;
            }
        }
        return array[result].value;
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