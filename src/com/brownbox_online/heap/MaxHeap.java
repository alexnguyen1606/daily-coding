package com.brownbox_online.heap;

/**
 * @author:Nguyen Anh Tuan
 * <p>11:58 PM ,August 30,2021
 */
public class MaxHeap implements IHeap {
    private final int MAX_SIZE;
    private final int[] array;
    private int size;

    public MaxHeap(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.array = new int[MAX_SIZE + 1];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return array[1];
    }

    @Override
    public int poll() {
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        }
        int returnValue = array[1];
        swap(1, size);
        size--;
        heapifyDown(1);
        return returnValue;
    }

    /**
     * Restores the max-heap property by "bubbling down" the element at index i.
     * This is called after removing the root or replacing an element.
     * It compares the current node with its children and swaps with the larger child if necessary,
     * continuing until the heap property is restored.
     *
     * @param i the index to start heapifying down from (usually 1 for the root)
     */
    private void heapifyDown(int i) {
        int iLeft, iRight, biggerValueIndex;
        // While the current node has at least a left child
        while ((i * 2) <= size) {
            iLeft = i * 2; // Left child index
            biggerValueIndex = iLeft; // Assume left child is bigger initially
            iRight = iLeft + 1; // Right child index

            // If right child exists and is greater than left child, update biggerValueIndex
            if (iRight <= size && array[iRight] > array[biggerValueIndex]) {
                biggerValueIndex = iRight;
            }

            // If the bigger child is greater than the current node, swap them
            if (array[biggerValueIndex] > array[i]) {
                swap(biggerValueIndex, i);
                i = biggerValueIndex; // Move down to the child index
            } else {
                // Heap property is satisfied, break out of the loop
                break;
            }
        }
    }

    @Override
    public void add(int val) {
        if (size == MAX_SIZE) {
            return;
        }
        size++;
        array[size] = val;
        heapifyUp(size);
    }

    private void heapifyUp(int i) {
        int parentIndex = i / 2;
        while (parentIndex != 0 && array[parentIndex] < array[i]) {
            swap(parentIndex, i);
            i = parentIndex;
            parentIndex = i / 2;
        }

    }

    @Override
    public void remove(int val) {
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        IHeap heap = new MaxHeap(100);
        heap.add(1);
        heap.add(2);
        heap.add(3);
        System.out.println(heap.peek());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
    }
}
