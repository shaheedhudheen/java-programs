import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        runningSum(nums);
    }

    private static void runningSum(int[] nums) {
        int[] runningSum =new int[nums.length];
        runningSum[0] = nums[0];
        for(int i= 1;i<nums.length;i++){
            runningSum[i] = nums[i] + runningSum[i - 1];
        }
        System.out.println(Arrays.toString(runningSum));
    }
}
