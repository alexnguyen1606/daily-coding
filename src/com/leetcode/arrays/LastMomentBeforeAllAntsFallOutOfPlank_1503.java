package com.leetcode.arrays;

public class LastMomentBeforeAllAntsFallOutOfPlank_1503 {

    //n is length of plank
    //left[] is ants go to left
    //right[] is ants go to right
    public int getLastMoment(int n, int[] left, int[] right) {
        int N = n + 1;
        int[] goToLeft = new int[N];
        int[] goToRight = new int[N];
        int sumLeft = 0;

        for (int i : left) {
            goToLeft[i] = 1;
            sumLeft++;
        }
        int sumRight = 0;
        for (int i : right) {
            goToRight[i] = 1;
            sumRight++;
        }
        int count = 0;

        while (sumLeft > 0 || sumRight > 0) {
            int i = 0;
            int j = N - 1;
            while (i < N || j >= 0) {
                if (i < N && goToLeft[i] != 0) {
                    if (i - 1 >= 0) {
                        goToLeft[i - 1] = goToLeft[i];
                    }
                    goToLeft[i] = 0;
                    if (i - 1 < 0) {
                        sumLeft--;
                    }
                }
                if (j >= 0 && goToRight[j] != 0) {
                    if (j + 1 < N) {
                        goToRight[j + 1] = goToRight[j];
                    }
                    goToRight[j] = 0;
                    if (j + 1 >= N) {
                        sumRight--;
                    }
                }
                i++;
                j--;
            }
            count++;

        }

        return count > 0 ? count - 1 : count;
    }

    public int getLastMomentV2(int n, int[] left, int[] right) {
        int count = 0;
        int N = n + 1;
        int totalAntGoToLeft = 0;
        for (int i : left) {
            totalAntGoToLeft++;
        }

        int totalAntGoToRight = 0;
        for (int i : right) {
            totalAntGoToRight++;
        }
        while (totalAntGoToLeft > 0 || totalAntGoToRight > 0) {
            if (totalAntGoToLeft > 0) {
                for (int i = 0; i < left.length; i++) {
                    if (left[i] >= 0) {
                        left[i]--;
                        if (left[i] < 0) {
                            totalAntGoToLeft--;
                        }
                    }
                }
            }
            if (totalAntGoToRight > 0) {
                for (int i = 0; i < right.length; i++) {
                    if (right[i] < N) {
                        right[i]++;
                        if (right[i] >= N) {
                            totalAntGoToRight--;
                        }
                    }
                }
            }
            count++;
        }
        return count > 0 ? count - 1 : count;
    }

    public int getLastMomentV3(int n, int[] left, int[] right) {
        int maxIndexLeft = n + 1;
        int minIndexRight = -1;
        for (int i : left) {
            if(maxIndexLeft == n +1) {
                maxIndexLeft = i;
                continue;
            }
            if(i >= maxIndexLeft) {
                maxIndexLeft = i;
            }
        }
        for (int i : right) {
            if(minIndexRight == -1) {
                minIndexRight = i;
                continue;
            }
            if(i <= minIndexRight) {
                minIndexRight = i;
            }
        }
        int stepInLeft = maxIndexLeft;
        int stepInRight = n + 1 - minIndexRight;

        return Math.max(stepInRight, stepInLeft);
    }

    public static void main(String[] args) throws InterruptedException {
        int n = 4;
        int[] left = new int[]{4, 3};
        int[] right = new int[]{0, 1};
        LastMomentBeforeAllAntsFallOutOfPlank_1503 counter = new LastMomentBeforeAllAntsFallOutOfPlank_1503();

        int count = counter.getLastMomentV2(n, left, right);
        System.out.println(count);
    }

}
