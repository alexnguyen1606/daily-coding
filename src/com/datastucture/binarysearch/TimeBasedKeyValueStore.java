package com.datastucture.binarysearch;

import java.util.*;

//https://leetcode.com/problems/time-based-key-value-store/
public class TimeBasedKeyValueStore {
    static class TimeMap {
        Map<String, SortedSet<Node>> map = new HashMap<>();

        public TimeMap() {
        }

        public void set(String key, String value, int timestamp) {
            if (!map.containsKey(key)) {
                map.put(key, new TreeSet<>());
            }
            map.get(key).add(new Node(timestamp, value));
        }

        public String get(String key, int timestamp) {
            if (!map.containsKey(key)) {
                return "";
            }
            SortedSet<Node> set = map.get(key);
            Node temp = new Node(timestamp + 1);
            SortedSet<Node> set2 = set.headSet(temp);
            if (set2.isEmpty()) {
                return "";
            }
            Node node = set2.last();
            return node != null ? node.value : "";
        }


        static class Node implements Comparable<Node> {
            Integer timestamp;
            String value;

            public Node(Integer timestamp, String value) {
                this.timestamp = timestamp;
                this.value = value;
            }

            public Node(Integer timestamp) {
                this.timestamp = timestamp;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                Node node = (Node) o;
                return Objects.equals(timestamp, node.timestamp);
            }

            @Override
            public int hashCode() {
                return Objects.hashCode(timestamp);
            }

            @Override
            public int compareTo(Node o) {
                return this.timestamp.compareTo(o.timestamp);
            }
        }
    }

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        System.out.println(timeMap.get("foo", 1));
        System.out.println(timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);

        System.out.println(timeMap.get("foo", 4));
        System.out.println(timeMap.get("foo", 5));

    }

}
