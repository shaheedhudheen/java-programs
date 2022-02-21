import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial();
    }

    private static void factorial() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println(result);
        }
    }

