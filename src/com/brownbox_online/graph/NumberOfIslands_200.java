package com.brownbox_online.graph;

/**
 * @author:Nguyen Anh Tuan
 *     <p>1:50 PM ,August 25,2021
 */
public class NumberOfIslands_200 {

  private boolean[][] traveled = new boolean[300][300];
  // Số hàng
  private int n;
  // Số cột
  private int m;

  private void DFS(char[][] grid, int i, int j) {
    // Điều kiện dừng
    if (!isValid(i, j)) {
      return;
    }
    if (grid[i][j] == '0' || traveled[i][j]) {
      return;
    }
    // Đánh dấu đã duyệt
    traveled[i][j] = true;

    // Duyệt theo 4 hướng
    DFS(grid, i, j + 1);
    DFS(grid, i, j - 1);
    DFS(grid, i - 1, j);
    DFS(grid, i + 1, j);
  }

  private boolean isValid(int i, int j) {
    if (i < 0 || i >= n) {
      return false;
    }
    return j >= 0 && j < m;
  }

  public int numIslands(char[][] grid) {
    // Init Số hàng
    n = grid.length;
    // Int Số cột
    m = grid[n - 1].length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (grid[i][j] == '1' && !traveled[i][j]) {
          DFS(grid, i, j);
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int x = 10;
    x=x+ (x>>1);
    System.out.println(x);
	  x=x+ (x>>1);
    System.out.println(x);
	  x=x+ (x>>1);
    System.out.println(x);
	  x=x+ (x>>1);
    System.out.println(x);
//	  ArrayList
  }
}
