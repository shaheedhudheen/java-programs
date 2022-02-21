public class LinearSearch  {
    public static void main(String[] args) {
        int[] nums = {34,89,43,23,98,25,46,97};
        int target = 898;
        int ans = linear(nums, target);
        System.out.println(ans);
    }
    //Search in the array: return the index if found
    //otherwise if item not found return -1
    static int linear(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}