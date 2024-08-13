package com.lcm.sol;

public class Solution {
    public int lcm(int a, int b){
        hcfClass HCF = new hcfClass();
        return ((a*b)/HCF.hcf(a, b));
    }
}
//Formula of lcm
//lcm=a*b/hcf