import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = input.nextInt();

        if(year % 400 == 0){
            System.out.println("Leap Year");
        }
        else if( year % 100 != 0 && year % 4 == 0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("not a Leap Year");
        }
    }
}
