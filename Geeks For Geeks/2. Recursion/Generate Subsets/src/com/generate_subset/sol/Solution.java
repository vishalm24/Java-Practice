package com.generate_subset.sol;

public class Solution {
    public void sol(String str, String curr, int index){
        if(index == str.length()){
            System.out.print(curr+" ");
            return;
        }
        sol(str, curr+str.charAt(index), index+1);
        sol(str, curr, index+1);
    }
}
