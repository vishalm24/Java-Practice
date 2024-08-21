package com.print_N_to_1.sol;

public class Solution {
    public void printNto1(int N){
        if(N<=0){
            return;
        }
        else{
            
            System.out.print(N+" ");
            printNto1(N-1);
        }
    }
}
