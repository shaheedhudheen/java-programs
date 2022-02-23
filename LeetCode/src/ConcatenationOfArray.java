// https://leetcode.com/problems/concatenation-of-array

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        getConcatenation(nums);

    }

    public static void getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        //nums.length = length of number arrray
        for(int i=0; i< nums.length; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
            //also written as ans[i + nums.length] = ans[i] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}