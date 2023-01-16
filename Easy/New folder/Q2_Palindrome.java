import java.util.*; //Q - 9

public class Q2_Palindrome {

    public static boolean isPalindrome(int x) {
        int org = x;
        int temp = 0, sum = 0;

        while (x != 0) {
            temp = x % 10;
            sum = (sum * 10) + temp;
            x /= 10;
        }

        if (org < 0) {
            return false;
        } else {
            if (sum == org) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (isPalindrome(x)) {
            System.out.println(isPalindrome(x));
        } else {
            System.out.println(isPalindrome(x));
        }
        sc.close();
    }

}