package com.sum_of_numbers.sol;

public class Solution {
    public int sum(int n){
        if(n<=1){
            return n;
        }
        return n+sum(n-1);
    }
}
