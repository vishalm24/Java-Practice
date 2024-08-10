package com.trail.main;

import java.util.Scanner;

import com.trail.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's find trailing zeros in factorial");
        System.out.println("Please enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution sol = new Solution();
        System.out.println("Trailing zeros in factorial of "+num+" is "+sol.trail(num));
        sc.close();
    }
}
//Trailing zeros means zero at the end of number.
//Example: 20! = 24,32,90,20,08,17,66,40,000
//Total trailing zeros in factorial is 4.