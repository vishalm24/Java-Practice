package com.print_N_to_1.main;

import java.util.Scanner;

import com.print_N_to_1.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("In this code we are going to print number from N to 1 by using recursion.");
        System.out.print("Please enter value of N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Solution sol = new Solution();
        sol.printNto1(N);
        sc.close();
    }
}
