import java.util.Scanner;

import com.primeFactors.sol.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In this code we are going to find prime factors of given number.");
        System.out.println("Please enter the number:");
        int num = sc.nextInt();
        Solution sol = new Solution();
        sol.prime(num);
        sc.close();
    }
}
