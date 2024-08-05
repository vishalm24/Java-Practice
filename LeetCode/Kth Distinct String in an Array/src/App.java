import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("This code is for finding distinct string in kth position.");
        System.out.println("Please enter total size of array for storing string");
        int size = sc.nextInt();
        System.out.println("Now please enter String values to store in array");
        String[] arr = new String[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.next();
        }
        System.out.println("Now we need kth position");
        int k=sc.nextInt();
        String output=Solution.kthDistinct(arr,k);
        System.out.println("Distinct string at "+k+" is \""+output+"\"");
    }
    class Solution {
    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq = new HashMap<>();
        //Here we want to store and count string
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        //.getOrDefault is used for geting value stored in map. If not stored then we set default value. Which is 0 for key String "s". And if we have some value stored then we are just going to add value 1. Which means it counts occurance of string.
        // Now we are collecting distinct strings in the order they appear
        List<String> distinctStrings = new ArrayList<>();
        for (String s : arr) {
            if (freq.get(s) == 1) {
                distinctStrings.add(s);
            }
        }
        //Now we are going to return disting string which is kth position.
        if (k <= distinctStrings.size()) {
            return distinctStrings.get(k - 1);
        } else {
            return "";
        }
    }
}
}
