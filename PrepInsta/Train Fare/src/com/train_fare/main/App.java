package com.train_fare.main;

import java.util.Scanner;

import com.train_fare.sol.Solution;

public class App {
    // Here we have told to calculate train fare as per train station.
    // So we are going to find train fare using 1000 meter distance to 5 INR.
    // If fare is 4.5 then also we have to consider it as 5 INR for each 1000 meter user is going to travel.
    //  5 INR is celing for fare.
    public static void main(String[] args) throws Exception {
        System.out.println("In this code we are going to solve a code about train fare calculation.");
        Scanner sc = new Scanner(System.in);
        String src = sc.next().toUpperCase();
        String dst = sc.next().toUpperCase();
        Solution sol = new Solution();
        int cost = sol.sol(src, dst);
        if(cost==0)
        System.out.println("Source and destination is same please enter valid inputs.");
        else{
            if(cost==-1)
            System.out.println("Please enter valid source and destination.");
            else
            System.out.println("Fare from "+src+" to "+dst+" is "+cost);
        }
        sc.close();
    }
}
