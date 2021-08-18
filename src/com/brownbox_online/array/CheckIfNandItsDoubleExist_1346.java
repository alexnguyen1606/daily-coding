package com.brownbox_online.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:Nguyen Anh Tuan
 *     <p>4:52 PM ,August 13,2021
 */
public class CheckIfNandItsDoubleExist_1346 {
  public boolean checkIfExist(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length - 1; i++) {
      if (map.containsKey(arr[i] * 2) || map.containsKey(arr[i] / 2) && arr[i] % 2 == 0) {
        return true;
      }
      map.put(arr[i], 1);
    }
    return false;
  }
}
