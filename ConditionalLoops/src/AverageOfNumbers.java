import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the number of Numbers: ");
        int n = in.nextInt();
        int count = 1;
        int sum = 0;
        while (count <= n){
            System.out.println("enter " + count + "number");
            int num = in.nextInt();
            sum = sum + num;
            count++;
        }
        float average = sum / count;
        System.out.println(average);
    }
}
