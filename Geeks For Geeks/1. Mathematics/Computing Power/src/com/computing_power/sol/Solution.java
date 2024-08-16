package com.computing_power.sol;

public class Solution {
    // //case 1: this is normal way.
    // public long computingPower(int x, int y){
    //     int cp=1;
    //     for(int i=0; i<y; i++){
    //         cp*=x;
    //     }
    //     return cp;
    // }
    //case 2: this is optimized way.
    public long computingPower(int x, int y){
        if(y==0) return 1;
        long temp = computingPower(x, y/2);
        temp = temp*temp;
        if(y%2==0) return temp;
        else return temp*x;
    }
}
