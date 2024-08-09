import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This code is for finding max length of string without repeating same character");
        System.out.print("Please enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution sol = new Solution();
        int max = sol.lengthOfLongestSubstring(s);
        System.out.println("Max length of string without repeating same charater is "+max);
        sc.close();
    }
}
