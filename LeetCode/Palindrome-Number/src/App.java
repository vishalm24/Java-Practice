import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to check wheather it is palindrome or not");
        int x = sc.nextInt();
        Solution sol = new Solution();
        boolean check = Solution.isPalindrome(x);
        System.out.println("Is given number palindrome? "+check);
    }
}
class Solution {
    public static boolean isPalindrome(int x) {
        int a = x;
        if(x<0){
            return false;
        }
        int b = 0;
        while(a!=0){
            b*=10;
            b=b+a%10;
            a/=10;
        }
        if(b==x){
            return true;
        }
        return false;
    }
}
