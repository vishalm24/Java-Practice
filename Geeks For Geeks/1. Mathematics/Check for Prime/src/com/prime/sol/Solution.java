package com.prime.sol;

public class Solution {
    // //case 1:
    // public boolean checkPrime(int num){
    //     if(num==1) return false;
    //     for(int i=2; i<=Math.sqrt(num); i++){
    //         if(num%i==0) return false;
    //     }
    //     return true;
    // }

    //case 2:
    public boolean checkPrime(int num){
        if(num==1) return false;
        if(num%2==0||num%3==0) return false;
        for(int i=5; i<=Math.sqrt(num); i+=6){
            if(num%i==0||num%(i+2)==0) return false;// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 53 57 59 61 67
        }
        return true;
    }
}
