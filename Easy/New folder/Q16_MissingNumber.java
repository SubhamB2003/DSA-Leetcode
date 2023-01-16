import java.util.*; // Q - 268

public class Q16_MissingNumber {

    public static int missingNumber(int[] nums) {
        int i, n = nums.length;
        int range = 0, sum = 0;

        for (i = 0; i < n; i++) {
            sum += nums[i];
            range += i;
        }
        range += i;

        return (range - sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = missingNumber(arr);

        System.out.println(result);
        sc.close();
    }
}
