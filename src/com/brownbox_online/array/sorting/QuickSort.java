package com.brownbox_online.array.sorting;

import java.util.Arrays;

/**
 * @author:Nguyen Anh Tuan
 *     <p>5:28 PM ,August 11,2021
 */
public class QuickSort extends BaseSort {
  public static void main(String[] args) {
    int[] array = {1, 2, 12, 45, 23, 5, 7, 0};
    quickSort(array, 0, array.length - 1);
    print(array);
  }

  public static void quickSort(int[] array, int L, int R) {
    // Điều kiện dừng
    // Khi chỉ còn 1 phần tử
    if (L >= R) {
      return;
    }
    // Tìm key
    // Có thể lấy ở vị trí bất kỳ
    // Sử dụng middle index in array
    int key = array[L+(R - L) / 2];
    System.out.println(Arrays.toString(array));
    int pivotIndex = pivot(array, L, R, key);
    System.out.println("L ="+L+" R="+R+" key="+key+" pivotIndex="+pivotIndex);
    quickSort(array, L, pivotIndex-1 );
    quickSort(array, pivotIndex, R);
  }

  // Return pivot
  // index chốt để chia tiếp
  // Dồn giá trị theo key bằng cách đổi chỗ 2 phần tử không hợp lệ
  // >= key phải ở bên phải mảng
  // <key phải ở bên trái mảng
  public static int pivot(int[] array, int L, int R, int key) {

    int iL = L;
    int iR = R;
    while (iL <= iR) {
      while (array[iL] < key) {
        iL++;
      }
      while (array[iR] > key) {
        iR--;
      }
      // check 2 lần, tránh th iR ,iL quá điều kiện
      // Đổi chỗ vị trí 2 phần từ k hợp lệ
      if (iL <= iR) {
        swap(array, iL, iR);
        iL++;
        iR--;
      }
    }
    return iL;
  }
}
