package com.palindrome_num.sol;

public class Solution {
    public boolean palindromeNum(int num){
        int dummy = num;
        int num2=0;
        while(dummy!=0){
            num2=(num2*10)+dummy%10;
            dummy/=10;
        }
        if(num==num2) return true;
        else return false;
    }
}
