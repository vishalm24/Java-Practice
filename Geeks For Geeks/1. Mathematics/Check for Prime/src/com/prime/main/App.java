package com.prime.main;

import java.util.Scanner;

import com.prime.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In this code let's check for input number is prime or not.");
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(num+" is prime number: "+sol.checkPrime(num));
        sc.close();
    }
}
