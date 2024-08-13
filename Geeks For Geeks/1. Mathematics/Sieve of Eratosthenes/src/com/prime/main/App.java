package com.prime.main;

import java.util.Scanner;

import com.prime.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's find all prime numbers till given number.");
        System.out.println("Please enter the number:");
        int num = sc.nextInt();
        Solution sol = new Solution();
        sol.prime(num);
        sc.close();
    }
}
