package com.train_fare.sol;

public class Solution {
    public int sol(String src, String dst){
        String [] route = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
        int [] fare = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
        int srcI=-1;
        int dstI=-1;
        boolean flag=false;
        for(int i=0; i<route.length; i++){
            if(src.equals(route[i])){
                srcI=i;
                flag=true;
            }
        }
        if(flag==false)
        return -1;
        flag=false;
        for(int i=0; i<route.length; i++){
            if(dst.equals(route[i])){
                dstI=i;
                flag=true;
            }
        }
        if(flag==false)
        return -1;
        if(srcI==dstI)
        return 0;
        if(srcI==-1 && dstI==-1)
        return -1;
        int z;
        if(srcI==7)
        z=0;
        else
        z=srcI+1;
        int y;
        if(dstI==7)
        y=0;
        else
        y=dstI+1;
        int dist=0;
        while(z!=y){
            dist+=fare[z];
            z++;
            if(z==8)
            z=0;
        }
        if(dist%1000==0)
        return (dist/1000)*5;
        return ((dist/1000)+1)*5;
    }
}
