package com.divisors_number.main;

import java.util.Scanner;

import com.divisors_number.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's find all divisors of a number");
        System.out.println("Please enter the number:");
        int num = sc.nextInt();
        Solution sol = new Solution();
        sol.divisorsNum(num);
        sc.close();
    }
}
