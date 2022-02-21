import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the unit: ");
        int unit = in.nextInt();
        double amount = 1;
        if (unit <= 100){
           amount  = unit * 10;
        }
        else if (unit > 100 && unit <= 200) {
            amount = (100 * 10) + (unit - 100) * 15;
        }
        else if (unit > 200 && unit <= 300){
            amount  = (100 * 10) + (100 * 15) + (unit - 200) * 20;
        }
        else {
            amount = (100 * 10) + (100 * 15) + (100 * 20) + (unit - 300) * 25;
        }
        System.out.println(amount);
    }
}
