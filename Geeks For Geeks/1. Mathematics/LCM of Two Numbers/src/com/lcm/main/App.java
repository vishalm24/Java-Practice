package com.lcm.main;

import java.util.Scanner;

import com.lcm.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's find gcd or lcm from 2 numbers:");
        System.out.println("Please enter 2 numbers:");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution sol = new Solution();
        System.out.println("LCM of input numbers "+sol.lcm(a, b));
        sc.close();
    }
}
