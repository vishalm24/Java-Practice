package com.print_1_to_N.sol;

public class Solution {

    public void print1toN(int N) {
        if(N>0){
            print1toN(N-1);
            System.out.print(N+" ");
        }
        return;
    }

}
