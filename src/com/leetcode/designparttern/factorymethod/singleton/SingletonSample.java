package com.leetcode.designparttern.factorymethod.singleton;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:11 AM ,July 19,2021
 */
public class SingletonSample {

	private static SingletonSample instance;

	private SingletonSample(){

	}

	public static SingletonSample getInstance(){
		if (instance==null){
			instance = new SingletonSample();
		}
		return instance;
	}

}
