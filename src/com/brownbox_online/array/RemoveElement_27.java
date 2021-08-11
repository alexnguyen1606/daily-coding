package com.brownbox_online.array;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 3:21 PM ,August 06,2021
 */
public class RemoveElement_27 {

	// return length nums after remove all element with value = val
	public int removeElement(int[] nums, int val) {
		int count = nums.length;
		for (int i = 0;i<count;i++){
			if (nums[i] == val) {
				removeElementWithIndex(nums,i);
				count--;
				i--;
			}
		}
		return count;
	}

	// return new length
	public int removeElementWithTwoPointer(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i< nums.length;i++){
			if (nums[i] != val){
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}

	private void removeElementWithIndex(int[] array,int index){
		for (int i = index ;i < array.length-1;i++){
			array[i] = array[i+1];
		}

	}

	private static int count(int[] array){
		int count = 0;
		for (int x : array){
			if (x>0){
				count++;
			}
		}
		return count;
	}

}
