package com.ahammed;

public class Linear {

    public static void main(String[] args) {

        int[] nums = {21,43,65,23,43,1,56,7,89,69,54};
        int target = 53;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //search in the array : return index if found item
    //otherwise if the item is not found return -1

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
    //run for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if its = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
