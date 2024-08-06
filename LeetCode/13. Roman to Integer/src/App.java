import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("This code is used for converting roman to interger number");
        System.out.println("Please enter the roman number for conversion: ");
        String s = sc.next();
        Solution sol = new Solution();
        int Output = sol.romanToInt(s);
        System.out.println("Integer conversion of " + s + " is "+ Output);
    }
}
