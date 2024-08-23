package com.sum_of_digits.sol;

public class Solution {
    public int sum(int num){
        if(num==0) return 0;
        return (num%10)+sum(num/10);
    }
}
