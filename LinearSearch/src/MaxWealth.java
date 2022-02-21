public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        // person = row
        // account = column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //WHEN YOU START NEW COL TAKE THE SUM OF THAT ROW
                int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+=accounts[person][account];
            }
            //now we have sum of accounts of person
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
