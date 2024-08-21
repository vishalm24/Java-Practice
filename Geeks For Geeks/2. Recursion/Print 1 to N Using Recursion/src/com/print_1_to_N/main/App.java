package com.print_1_to_N.main;

import java.util.Scanner;

import com.print_1_to_N.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("In this code we are going to print number from N to 1 by using recursion.");
        System.out.print("Please enter value of N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Solution sol = new Solution();
        sol.print1toN(N);
        sc.close();
    }
}
