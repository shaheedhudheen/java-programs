public class Swap {
    public static void main(String[] args) {

        swap(20, 30);

    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + "b = " + b);
    }
}
