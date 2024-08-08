import java.util.Scanner;

//This code is for checking 2 given strings are anagram or not.
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.err.println("Please enter 2 strings for checking both are anagrams or not");
        String a = scan.next();
        String b = scan.next();
        scan.close();
        Solution sol = new Solution();
        boolean ret = sol.isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
