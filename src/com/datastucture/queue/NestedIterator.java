package com.datastucture.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/flatten-nested-list-iterator
public class NestedIterator implements Iterator<Integer> {

    private Queue<Integer> queue;

    public NestedIterator(List<NestedInteger> nestedList) {
        queue = new LinkedList<>();
        build(nestedList, queue);
    }

    private void build(List<NestedInteger> nestedList, Queue<Integer> queue) {
        for (NestedInteger nestedInteger: nestedList) {
            if (nestedInteger.isInteger()) {
                queue.add(nestedInteger.getInteger());
            } else {
                build(nestedInteger.getList(), queue);
            }
        }
    }

    @Override
    public Integer next() {
        return queue.poll();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public interface NestedInteger {

             // @return true if this NestedInteger holds a single integer, rather than a nested list.
              public boolean isInteger();

             // @return the single integer that this NestedInteger holds, if it holds a single integer
              // Return null if this NestedInteger holds a nested list
              public Integer getInteger();

             // @return the nested list that this NestedInteger holds, if it holds a nested list
              // Return empty list if this NestedInteger holds a single integer
              public List<NestedInteger> getList();
  }
}
