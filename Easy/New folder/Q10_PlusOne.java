import java.util.*; // Q - 66

public class Q10_PlusOne {

    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] new_number = new int[n + 1];
        new_number[0] = 1;
        return new_number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the arr length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the 1st arr : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        plusOne(arr);

        System.out.println("Plus one array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
