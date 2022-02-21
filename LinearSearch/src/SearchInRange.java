public class SearchInRange {
    public static void main(String[] args) {
      int[] nums = {2,5,7,5,3,9,0,6};
      int target = 6;
      int start = 2;
      int end = 6;
        System.out.println(linearRange(nums, target, start, end));
    }
    static int linearRange(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
