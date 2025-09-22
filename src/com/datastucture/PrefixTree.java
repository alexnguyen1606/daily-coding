package com.datastucture;

import java.util.ArrayList;
import java.util.List;

public class PrefixTree {
    static class Trie {
        Node root;
        public Trie() {
            root = new Node(null);
        }

        public void insert(String word) {
            char[] array = word.toCharArray();
            Node node = root;
            for (int i = 0; i < array.length; i++) {
                int idx = array[i] - 'a';
                if (node.edges[idx] == null) {
                    node.edges[idx] = new Node(array[i]);
                }
                node = node.edges[idx];
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            char[] array = word.toCharArray();
            Node node = root;
            for (int i = 0; i < array.length; i++) {
                int idx = array[i] - 'a';
                if(node.edges[idx] == null) {
                    return false;
                }
                node = node.edges[idx];
            }
            return node.isEnd;
        }

        public boolean startsWith(String prefix) {
            char[] array = prefix.toCharArray();
            Node node = root;
            for (int i = 0; i < array.length; i++) {
                int idx = array[i] - 'a';
                if (node.edges[idx] == null) {
                    return false;
                }
                node = node.edges[idx];
            }
            return node != null;
        }
        static class Node {
            Character val;
            Node[] edges = new Node[26];
            boolean isEnd;

            Node(Character val) {
                this.val = val;
            }
        }
    }




    public static void main(String[] args) {
        String algo = "algo";
        Trie trie = new Trie();
        trie.insert(algo);
        trie.insert("abc");
        trie.insert(algo);
        System.out.println(trie.startsWith("ab"));
    }

}
