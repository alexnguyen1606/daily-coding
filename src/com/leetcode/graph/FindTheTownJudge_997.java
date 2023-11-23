package com.leetcode.graph;

import java.util.HashSet;
import java.util.Set;

public class FindTheTownJudge_997 {


    // bigO = O(n)
    public int findJudge(int n, int[][] trust) {
        Set<Integer>[] personTrustIn = new Set[n + 1];
        for(int i = 1; i < personTrustIn.length; i++) {
            personTrustIn[i] = new HashSet<>();
        }
        for (int[] pairTrust : trust) {
            personTrustIn[pairTrust[0]].add(pairTrust[1]);
        }
        int judgeTown = -1;
        for(int i = 1; i < personTrustIn.length; i++) {
            if(personTrustIn[i].size() == 0 && judgeTown != -1) {
                return -1;
            }
            if(personTrustIn[i].size() == 0) {
                judgeTown = i;
            }
        }
        for(int i = 1; i < personTrustIn.length; i++) {
            if(i == judgeTown) {
                continue;
            }
            if(!personTrustIn[i].contains(judgeTown)) {
                return -1;
            }
        }
        return judgeTown;
    }


//    This approach uses two vectors, one to store the in-degree and another to store the out-degree of each person in the town.
//    The in-degree represents the number of people who trust a particular person and the out-degree represents the number of people
//    that a particular person trusts.
//
//    The solution then iterates through the trust vector, updating the in-degree and out-degree of each person as it goes.
//    After this, it iterates through the in-degree and out-degree vectors and checks if there is a person with in-degree equal to N-1
//    (since everyone except the judge trusts them) and out-degree equal to 0 (since the judge does not trust anyone).
//    If such a person is found, their index (which represents their ID) is returned. If no such person is found, -1 is returned.
//
//    This approach works because in a town where there is a judge,
//    there should be one person who is trusted by everyone and does not trust anyone else.
//    This is represented by a person with in-degree equal to N-1 and out-degree equal to 0.
    public int findJudgeOptimize(int n, int[][] trust) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];
        for(int[] pairTrust: trust){
            int u = pairTrust[0];
            int v = pairTrust[1];
            inDegree[v]++;
            outDegree[u]++;
        }
        for(int i = 1; i < n + 1; i++) {
            if(inDegree[i] == n - 1 && outDegree[i] == 0) {
                return i;
            }
        }

        return -1;

    }


}
