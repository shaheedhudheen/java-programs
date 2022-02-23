//https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {
       int[][] accounts = {
               {2,8,7},
               {7,1,3},
               {1,9,5} };
       int wealth = maximumWealth(accounts);
       System.out.println(wealth);
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {

            int sum = 0;

            for (int j = 0; j < account.length; j++) {

                sum = sum + account[j];
            }

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

