package com.leetcode.designparttern.factorymethod.singleton;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:13 AM ,July 19,2021
 */
public class SingletonConcurrent {
	private static SingletonConcurrent instance;

	private SingletonConcurrent(){

	}


	// double check locking
	public static SingletonConcurrent getInstance(){
		if (instance==null){
			synchronized (SingletonConcurrent.class){
				if (instance==null){
					instance = new SingletonConcurrent();
				}
			}
		}
		return instance;
	}

}
