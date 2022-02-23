//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.Arrays;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        ArrayList<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);

    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();

        int max = 0;

        for (int candy : candies) {

            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
