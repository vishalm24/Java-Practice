package com.primeFactors.sol;

public class Solution {
    //case 2:
    public void prime(int num){
        while(num%2==0){
            System.out.print(2+" ");
            num/=2;
        }
        while(num%3==0){
            System.out.print(3+" ");
            num/=3;
        }
        for(int i=5; i<=Math.sqrt(num); i+=6){
            if(num%i==0){
                System.out.print(i+" ");
                num/=i;
            }
            if(num%(i+2)==0){
                System.out.print((i+2)+" ");
                num/=i+2;
            }
        }
        if(num>3)
        System.out.print(num);
    }
}
