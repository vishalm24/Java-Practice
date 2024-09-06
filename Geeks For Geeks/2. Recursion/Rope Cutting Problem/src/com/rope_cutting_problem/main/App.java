package com.rope_cutting_problem.main;

import java.util.Scanner;

import com.rope_cutting_problem.solution.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This code is used for finding maximum number after cutting.");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter length of rope: ");
        int n=sc.nextInt();
        System.out.print("Enter length of a: ");
        int a=sc.nextInt();
        System.out.print("Enter length of b: ");
        int b=sc.nextInt();
        System.out.print("Enter length of c: ");
        int c=sc.nextInt();
        Solution sol = new Solution();
        System.out.println("Maximum number of cutted rope is: "+sol.ropeCutting(n, a, b, c));
        sc.close();
    }
}
