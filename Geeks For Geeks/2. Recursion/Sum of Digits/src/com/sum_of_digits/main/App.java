package com.sum_of_digits.main;

import java.util.Scanner;

import com.sum_of_digits.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's find sum of digits from given number");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(num+" Sum of all digits from given number "+sol.sum(num));
        sc.close();
    }
}
