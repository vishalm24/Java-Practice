package com.count_digits.main;

import java.util.Scanner;

import com.count_digits.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This code is for counting total digits present input number.");
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution sol = new Solution();
        int digits = sol.countNumber(num);
        System.out.println("Total number of digits present in "+num+" is "+digits);
        sc.close();
    }
}