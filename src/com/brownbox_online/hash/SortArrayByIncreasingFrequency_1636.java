package com.brownbox_online.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 1:15 PM ,August 13,2021
 */
public class SortArrayByIncreasingFrequency_1636 {

	public static void main(String[] args) {
		SortArrayByIncreasingFrequency_1636 s = new SortArrayByIncreasingFrequency_1636();
		int[] x = {2,2,3,45,23,4,3,22,3,0};
		System.out.println(Arrays.toString(s.frequencySort(x)));
	}

	public int[] frequencySort(int[] nums) {
		int ADD_VALUE = 100;
		int MAX_VALUE = 100 + ADD_VALUE;
		int[] count = new int[MAX_VALUE + 1];
		int convertedValue;
		for (int num : nums) {
			convertedValue = num + ADD_VALUE;
			count[convertedValue]++;
		}
		List<Node> listNode = new ArrayList<>(nums.length);
		for (int i = 0; i < count.length; i++) {
			if (count[i] >0){
				int originValue = i - ADD_VALUE;
				Node node = new Node(originValue,count[i]);
				listNode.add(node);
			}
		}
		Collections.sort(listNode);
		int[] result = new int[nums.length];
		int i = 0;
		int k;
		for (Node node : listNode){
			k = node.freq;
			while (k>0){
				result[i] = node.value;
				i++;
				k--;
			}
		}
		return result;
	}

	static class Node implements Comparable {
		private int value;
		private int freq;

		public Node(int value, int freq) {
			this.value = value;
			this.freq = freq;
		}

		@Override
		public int compareTo(Object o) {
			Node otherNode = (Node) o;
			if (this.freq == otherNode.freq) {
				return -Integer.compare(this.value, otherNode.value);
			}
			return Integer.compare(this.freq, otherNode.freq);
		}
	}
}
