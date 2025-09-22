package com.leetcode.segmentree;

public class RangeSumImmutable_303 {
    static class NumArray {

        private int[] nums;
        private int[] segmentTree;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.segmentTree = new int[nums.length * 4];
            buildSegmentTree(1, 0, nums.length - 1);
        }

        private void buildSegmentTree(int v, int left, int right) {
            if (left == right) {
                segmentTree[v] = nums[left];
                return;
            }

            int mid = (left + right) / 2;
            buildSegmentTree(2 * v, left, mid);
            buildSegmentTree(2 * v + 1, mid + 1, right);
            segmentTree[v] = segmentTree[2 * v] + segmentTree[2*v +1];
        }

        public int sumRange(int start, int end) {
            return sum(1, 0, nums.length - 1, start, end);
        }

        public void update(int index, int val) {
            if (index < 0 || index >= nums.length) {
                return;
            }
            this.nums[index] = val;
            update(1, 0, nums.length - 1, index, val);
        }
    
        // v vị trí trên tree
        // pos index update trên mảng dữ liệu gốc input
        // val giá trị thay đổi
        private void update(int v, int left, int right, int pos, int val) {
            if (left == right) {
                segmentTree[v] = val;
                return;
            }
            int mid = (left + right) / 2;
            if (pos <= mid) {
                update(2 * v, left, mid, pos, val);
            } else {
                update(2 * v + 1, mid + 1, right, pos, val);
            }
            segmentTree[v] = segmentTree[2 * v] + segmentTree[2 * v + 1];
        }

        private int sum(int node, int tl, int tr, int l, int r) {
            {

                // If it lies out of range then
                // return 0
                if (r < tl || tr < l)
                    return 0;
        
                // If the node contains the range then
                // return the node value
                if (l <= tl && tr <= r)
                    return segmentTree[node];
                int tm = (tl + tr) / 2;
        
                // Recursively traverse left and right
                // and find the node
                return sum(2 * node, tl, tm, l, r)
                    + sum(2 * node + 1, tm + 1, tr, l, r);
            }

            
        }
    }
}


