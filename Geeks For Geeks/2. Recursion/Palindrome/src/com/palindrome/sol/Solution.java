package com.palindrome.sol;

public class Solution {
    public boolean palindrome(String str){
        int n = str.length();
        if(n==0) return true;
        CheckPalindrome check = new CheckPalindrome();
        return check.isPalindrome(str, 0, n-1);
    }
}
