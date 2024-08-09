package com.count_digits.sol;

public class Solution {
    public int countNumber(int num){
        int digits = 0;
        while(num!=0){
            digits++;
            num/=10;
        }
        return digits;
    }
}
