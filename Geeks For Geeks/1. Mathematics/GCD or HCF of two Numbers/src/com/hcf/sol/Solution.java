package com.hcf.sol;

public class Solution {
    public int hcf(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if(a>b) return hcf(a-b, b);
        return hcf(a, b-a);
    }
}
