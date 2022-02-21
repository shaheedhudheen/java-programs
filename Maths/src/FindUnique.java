public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,7,2,1,8,6,7,5};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {

        int unique = 0;

        for(int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}

