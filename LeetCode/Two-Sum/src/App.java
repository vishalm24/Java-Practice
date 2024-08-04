import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for lenght of array");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.println("Please enter array");
        for(int i=0; i<len; i++){
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        System.out.println("Please enter the target");
        int target = sc.nextInt();
        int[] output = sol.twoSum(nums, target);
        System.out.print("Output Array: ");
        System.out.println(Arrays.toString(output));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] SumIndexes = new int [2];
        for(int i=0; i<nums.length; i++){
            for(int j=0+i; j<nums.length; j++){
                if(i!=j){
                    if(nums[i] + nums[j] == target){
                        SumIndexes[0] = i;
                        SumIndexes[1] = j;
                        break;
                    }
                }
            }
        }
        return SumIndexes;
    }
}