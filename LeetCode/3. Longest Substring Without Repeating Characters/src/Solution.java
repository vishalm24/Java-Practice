import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left =0;
        for(int right=0; right<n; right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            }
            else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}
// char[] arr = s.toLowerCase().toCharArray();
//         int[] a = new int[arr.length];
//         int max=1;
//         for(int i=0; i<arr.length; i++){
//             a[i]=1;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]!=arr[j]){
//                     a[i]=a[i]+1;
//                     continue;
//                 }
//                 break;
//             }
//         }
//         for(int i=0; i<a.length; i++){
//             if(a[i]>max) max=a[i];
//         }
//         return max;