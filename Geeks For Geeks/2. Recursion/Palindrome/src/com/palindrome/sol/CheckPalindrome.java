package com.palindrome.sol;

public class CheckPalindrome {
    public boolean isPalindrome(String str, int s, int n){
        if(s==n) return true;
        if((str.charAt(s))!=(str.charAt(n))) return false;
        if(s<n+1){
            return isPalindrome(str, s+1, n-1);
        }
        return true;
    }
}
