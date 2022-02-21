public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,3443,153,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;

        for(int num: nums){
            if (even(num)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }


    //step1 count the number of digit

    //type2 convert to string and take lenth

    //find number of digits
    static int digits(int num) {
        int count = 0;
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        while(num > 0){
            count++;
            num/= 10;
        }
        return count;
    }
    // another way to find number of digits
    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}

