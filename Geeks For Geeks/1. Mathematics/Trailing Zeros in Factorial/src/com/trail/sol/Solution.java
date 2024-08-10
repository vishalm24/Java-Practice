package com.trail.sol;

public class Solution {
    public int trail(int num){
        int zeros=0;
        for(int i=5; num/i>=1; i*=5){
            zeros+=num/i;
        }
        return zeros;
    }
    // public int trail(int num){
    //     int zeros=0;
    //     long fact=1;
    //     for(int i=2; i<=num; i++){
    //         fact*=i;
    //         while(fact%10==0){
    //             zeros++;
    //             fact/=10;
    //         }
    //     }
    //     return zeros;
    // }
}
