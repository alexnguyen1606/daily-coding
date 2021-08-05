package com.leetcode.data_struct.hash;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:34 PM ,August 05,2021
 */
public class MyHashSet implements Iterator<Integer> {

	private final Integer SIZE = 1000;
	private final ArrayList<Integer>[] arrayList;

	public MyHashSet() {
		this.arrayList = new ArrayList[SIZE];
	}

	// return hash value
	private int hashFunction(int key) {
		return key % SIZE;
	}

	public void add(Integer value){
		int hashValueIndex = hashFunction(value);
		ArrayList<Integer> values = arrayList[hashValueIndex];
		if (values==null){
			arrayList[hashValueIndex]= new ArrayList<>();
			values = arrayList[hashValueIndex];
		}
		if(!values.contains(value)){
			values.add(value);
		}
	}

	public void remove(Integer value){
		int hashValueIndex = hashFunction(value);
		ArrayList<Integer> values = arrayList[hashValueIndex];
		if (values!=null){
			values.remove(value);
		}
	}

	public boolean contains(Integer value){
		int hashValueIndex = hashFunction(value);
		ArrayList<Integer> values = arrayList[hashValueIndex];
		if (values==null){
			return false;
		}
		return values.contains(value);
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Integer next() {
		return null;
	}
}
