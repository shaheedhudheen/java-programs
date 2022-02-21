public class MinNumber {
    public static void main(String[] args) {
        int[] nums = {5,7,5,2,3,9,6};
        int minimum = minNum(nums);
        System.out.println(minimum);
    }

    static int minNum(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}
