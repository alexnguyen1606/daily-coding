package com.leetcode.data_struct.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:14 PM ,August 05,2021
 */

public class MyHashMap {

	private final Integer SIZE = 1000;
	private final ArrayList<InnerHashMap>[] arrayList;

	public MyHashMap() {
		arrayList = new ArrayList[SIZE];
	}

	private int hashFunction(int key) {
		return key % SIZE;
	}

	public boolean contains(int key) {
		int valueHashIndex = hashFunction(key);
		ArrayList<InnerHashMap> values = arrayList[valueHashIndex];
		if (values == null) {
			return false;
		}
		InnerHashMap check = new InnerHashMap(key, 0);
		return values.contains(check);
	}

	public void put(int key, int value) {
		int valueHashIndex = hashFunction(key);
		// get bucket
		ArrayList<InnerHashMap> values = arrayList[valueHashIndex];
		// put to bucket
		if (values == null) {
			arrayList[valueHashIndex] = new ArrayList<>();
			arrayList[valueHashIndex].add(new InnerHashMap(key, value));
		}else {
			InnerHashMap check = new InnerHashMap(key, 0);
			int indexKey = values.indexOf(check);
			InnerHashMap innerHashMap = indexKey >= 0 ? values.get(indexKey) : check;
			innerHashMap.value = value;
			if (indexKey < 0) {
				values.add(innerHashMap);
			} else {
				values.set(indexKey,innerHashMap);
			}
		}

	}

	public int get(int key) {
		int valueHashIndex = hashFunction(key);
		ArrayList<InnerHashMap> values = arrayList[valueHashIndex];
		if (values != null) {
			for (InnerHashMap innerHashMap : values) {
				if (innerHashMap.key == key) {
					return innerHashMap.value;
				}
			}
		}
		return -1;
	}

	public void remove(int key) {
		int valueHashIndex = hashFunction(key);
		ArrayList<InnerHashMap> values = arrayList[valueHashIndex];
		if (values != null) {
			InnerHashMap check = new InnerHashMap(key,0);
			int index = values.indexOf(check);
			if (index>=0){
				values.remove(index);
			}
		}
	}

	private static class InnerHashMap {
		final int key;
		int value;

		private InnerHashMap(int key, int value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof InnerHashMap) {
				return this.key == ((InnerHashMap) obj).key;
			}
			return false;
		}
	}
}
