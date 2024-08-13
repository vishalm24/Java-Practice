package com.divisors_number.sol;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public void divisorsNum(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num%i==0){
                arr.add(i);
                arr.add(num/i);
            }
        }
        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}