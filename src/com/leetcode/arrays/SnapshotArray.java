package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:19 PM ,December 30,2020
 */
public class SnapshotArray {
    private int[] array;
    private int length;
    private Map<Integer, int[]> snapMap;
    private int totalSnap;
    private int maxIndex;
    
    public SnapshotArray(int length) {
        array = new int[length];
        this.length = length;
        snapMap = new HashMap<>();
    }
    
    public void set(int index, int val) {
        if (index >= length || array == null) {
            return;
        }
        array[index] = val;
        maxIndex = index > maxIndex ? index : maxIndex;
    }
    
    public int snap() {
        int[] snapArray = new int[maxIndex + 1];
        System.arraycopy(array, 0, snapArray, 0, maxIndex + 1);
        return getSnap(snapArray);
        
    }
    
    private int getSnap(int[] array) {
        snapMap.put(totalSnap, array);
        totalSnap = totalSnap + 1;
        return totalSnap - 1;
    }
    
    public int get(int index, int snap_id) {
        int[] arraySnap = snapMap.get(snap_id);
        if (arraySnap.length - 1 < index) {
            return 0;
        }
        return arraySnap[index];
        
    }
}
