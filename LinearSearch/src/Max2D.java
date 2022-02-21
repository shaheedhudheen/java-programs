import java.util.Arrays;
public class Max2D {
    public static void main(String[] args) {
        int[][] arr = {
                {11,22,55},
                {54,56,77,44},
                {87,32,65,34,57},
                {37,21}
        };
        System.out.println(maximum(arr));
    }

    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    }

