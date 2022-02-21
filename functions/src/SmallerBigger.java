import java.util.Scanner;

public class SmallerBigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = max(a,b,c);
        int min = min(a,b,c);

        System.out.println("maximum is : " + max);
        System.out.println("minimum is : " + min);
    }

    private static int max(int a, int b, int c) {
        int max = a;
        if (b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    private static int min(int a, int b, int c) {
        int min = a;
        if (b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }
}
