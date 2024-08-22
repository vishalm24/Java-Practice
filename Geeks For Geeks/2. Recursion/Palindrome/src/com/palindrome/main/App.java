package com.palindrome.main;

import java.util.Scanner;
import com.palindrome.sol.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("This code is used for checking given string is palindrome or not");
        System.out.print("Please enter the string: ");
        String str = sc.nextLine();
        Solution sol = new Solution();
        System.out.println(str+" is palindrome "+sol.palindrome(str));
        sc.close();
    }
}
