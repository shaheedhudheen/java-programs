import java.util.Scanner;

public class HalfPyramidRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hight of pyramid");
        int n = sc.nextInt();

        pyramid(n);
    }

    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
