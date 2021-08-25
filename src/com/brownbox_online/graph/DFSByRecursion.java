package com.brownbox_online.graph;

import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 *     <p>10:47 PM ,August 24,2021
 */
public class DFSByRecursion {
  public static void dfsByRecursion(int u, int[][] graph, Set<Integer> trevaled) {
    // Đánh dấu u
    trevaled.add(u);
    // Process U
    System.out.print(u + " ");
    for (int v = 0; v < graph.length; v++) {
      // Kiểm tra hợp lệ v
      // chưa được duyệt
      // u,v liền kề
      if (graph[u][v] == 1 && !trevaled.contains(v)) {
        // Đánh dấu v
        dfsByRecursion(v,graph,trevaled);
      }
    }
  }
}
