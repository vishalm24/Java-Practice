package com.rope_cutting_problem.solution;

public class Solution {
    public int ropeCutting(int n, int a, int b, int c){
        if(n==0)
        return 0;
        if(n<=-1)
        return -1;
        int res = Math.max(ropeCutting(n-a, a, b, c), Math.max(ropeCutting(n-b, a, b, c), ropeCutting(n-c, a, b, c)));
        if(res==-1){
            return -1;
        }
        return res+1;
    }
}
