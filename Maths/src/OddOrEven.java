public class OddOrEven {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
