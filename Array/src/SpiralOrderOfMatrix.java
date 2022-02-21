import java.util.Scanner;

public class SpiralOrderOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the elements of Matrix: ");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral order matrix is:");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
    }
}
