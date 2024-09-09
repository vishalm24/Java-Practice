package com.generate_subset.main;

import java.util.Scanner;

import com.generate_subset.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("This code is used for generate subsets.");
        System.out.print("Please enter the string for generating subsets: ");
        String str = sc.next();
        Solution sol = new Solution();
        sol.sol(str, "", 0);
        sc.close();
    }
}
