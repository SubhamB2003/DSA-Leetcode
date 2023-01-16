import java.util.*; // Q - 69

public class Q12_Sqrt {

    public int mySqrt(int x) {
        int result = (int) Math.sqrt(x);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value : ");
        int n = sc.nextInt();

        Q12_Sqrt ob = new Q12_Sqrt();
        int result = ob.mySqrt(n);

        System.out.println("Result : " + result);

        sc.close();
    }
}