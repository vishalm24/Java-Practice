package com.palindrome_num.main;

import java.util.Scanner;

import com.palindrome_num.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This code is for cheking input number is palindrome or not.");
        System.out.println("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution sol = new Solution();
        boolean output = sol.palindromeNum(num);
        System.out.println("Number "+num+" is palindrome: "+output);
        sc.close();
    }
}
