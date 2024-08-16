package com.computing_power.main;

import java.util.Scanner;

import com.computing_power.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("This code is for finding the value of Xⁿ");
        System.out.println("Please enter X");
        int x = sc.nextInt();
        System.out.println("Please enter ⁿ");
        int n = sc.nextInt();
        Solution sol = new Solution();
        long cp = sol.computingPower(x, n);
        System.out.println("Xⁿ is "+cp);
    }
}
