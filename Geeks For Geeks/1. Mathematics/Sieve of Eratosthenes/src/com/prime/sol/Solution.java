package com.prime.sol;

public class Solution {
    public void prime(int num){
        boolean isPrime[] = new boolean[num+1];
        for(int i = 0; i<=num; i++){
            isPrime[i]=true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(isPrime[i]==true){
                for(int j=2; j<=num/i; j++){
                    isPrime[i*j]=false;
                }
            }
        }
        for(int i=2; i<num; i++){
            if(isPrime[i]==true){
                System.out.print(i+" ");
            }
        }
    }
}
