package com.factorial.main;

import java.util.Scanner;

import com.factorial.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This code is for finding factorial of input number");
        System.out.println("Please enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution sol = new Solution();
        System.out.println("Factrial of "+num+" is "+sol.factorial(num));
        sc.close();
    }
}
