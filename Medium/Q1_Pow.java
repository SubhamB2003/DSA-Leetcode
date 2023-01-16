
import java.util.Scanner; //Q - 50

public class Q1_Pow {

    public static double myPow(double n, int x) {
        return Math.pow(n, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Complement : ");
        double n = sc.nextDouble();

        System.out.println("Enter the Power : ");
        int x = sc.nextInt();

        double result = myPow(n, x);

        System.out.println("Result : " + result);

        sc.close();
    }
}
