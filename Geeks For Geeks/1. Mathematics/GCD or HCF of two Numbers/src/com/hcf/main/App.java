package com.hcf.main;

import java.util.Scanner;

import com.hcf.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's find gcd or hcf from 2 numbers:");
        System.out.println("Please enter 2 numbers:");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution sol = new Solution();
        System.out.println("HCF or GCD of input numbers "+sol.hcf(a, b));
        sc.close();
    }
}
