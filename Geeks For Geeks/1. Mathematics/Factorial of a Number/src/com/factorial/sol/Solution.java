package com.factorial.sol;

public class Solution {
    public int factorial(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }
    // public int factorial(int num){
    //     if(num==0){
    //         return 1;
    //     }
    //     return (num*factorial(num-1));
    // }
}
