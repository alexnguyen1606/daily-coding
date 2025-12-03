package com.brownbox_online.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:16 PM ,August 24,2021
 */
public class BFSByQueue {

	public static void bfsByQueue(int[][] graph){
		Set<Integer> traveled = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();
		traveled.add(0);
		// Đánh dấu điểm bắt đầu
		queue.add(0);
		while (!queue.isEmpty()){
			Integer u = queue.poll();
			//xử lý u
			System.out.print(u+" ");
			for (int v=0;v<graph.length;v++){
				if (graph[u][v]==1 && !traveled.contains(v)){
					//Đánh dấu v
					traveled.add(v);
					//Thêm v vào queue
					queue.add(v);
				}
			}
		}
	}
}
