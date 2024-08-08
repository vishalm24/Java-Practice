import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String a, String b) {
        char[] A = a.toUpperCase().toCharArray();
        //java.util.Arrays.sort(A); we have to use this in hackerrank
        Arrays.sort(A);
        char[] B = b.toUpperCase().toCharArray();
        Arrays.sort(B);
        if(A.length==B.length){
            for(int i=0; i<A.length; i++){
                if(A[i]!=B[i]) return false;
            }
            return true;
        }
        return false;
    }
}
