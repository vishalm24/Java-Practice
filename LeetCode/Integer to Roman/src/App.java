import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In this code we are going to convert interger to roman number");
        System.out.println("Please enter the number till 3999");
        int num = sc.nextInt();
        Solution sol = new Solution();
        String Output=sol.intToRoman(num);
        System.out.println("Roman number of "+num+" is \""+Output+"\"");
    }
}