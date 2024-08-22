package com.sum_of_numbers.main;

import java.util.Scanner;

import com.sum_of_numbers.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for find addition of all natural numbers");
        int n = sc.nextInt();
        Solution sol = new Solution();
        System.out.println("Addition of all natural numbers is "+sol.sum(n));
        sc.close();
    }
}
