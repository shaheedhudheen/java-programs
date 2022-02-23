//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"X++","++X","++X","X--"};
        int result = finalValueAfterOperations(operations);
        System.out.println(result);
    }

        public static int finalValueAfterOperations(String[] operations) {
            int x = 0;
            for(int i=0; i< operations.length; i++){
                if(operations[i].charAt(1) == '+'){
                    x++;
                }
                if(operations[i].charAt(1) == '-'){
                    x--;
                }
            }
            return x;
        }
}

