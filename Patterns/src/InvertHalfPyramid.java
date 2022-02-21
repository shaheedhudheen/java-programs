import java.util.Scanner;

public class InvertHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Pyramid");
        int n = sc.nextInt();
        pyramid(n);
    }

    static void pyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

