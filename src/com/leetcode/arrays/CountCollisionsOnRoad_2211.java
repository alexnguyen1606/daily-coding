package com.leetcode.arrays;

public class CountCollisionsOnRoad_2211 {

    public int countCollisions(String directions) {
        int collision = 0;
        int[] check = new int[directions.length()];
        for (int i = 0; i < directions.length(); i++) {
            char direction = directions.charAt(i);
            if (direction == 'S') {
                continue;
            }
            if (i - 1 > 0 && directions.charAt(i - 1) == direction) {
                check[i] += check[i - 1];
                collision += check[i];
                continue;
            }

            if (direction == 'R') {
                for (int j = i + 1; j < directions.length(); j++) {
                    if (directions.charAt(j) == direction) {
                        continue;
                    }
                    collision++;
                    check[i]++;
                    break;
                }
            }
            if (direction == 'L') {
                for (int j = i - 1; j >= 0; j--) {
                    if (directions.charAt(j) == direction) {
                        continue;
                    }
                    collision++;
                    check[i]++;
                    break;
                }
            }
        }
        return collision;
    }

    public static void main(String[] args) {
        CountCollisionsOnRoad_2211 couter = new CountCollisionsOnRoad_2211();
        System.out.println(couter.countCollisions("RLRSLL"));
    }

}
