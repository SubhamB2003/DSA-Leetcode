import java.util.*; // Q - 231

public class Q15_PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {

        long i = 1;

        while (i < n) {
            i *= 2;
        }

        if (i == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        boolean result = isPowerOfTwo(n);

        System.out.println(result);
        sc.close();
    }

}
