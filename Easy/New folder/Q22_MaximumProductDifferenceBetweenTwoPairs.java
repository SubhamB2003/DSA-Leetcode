import java.util.*; // Q - 1913

public class Q22_MaximumProductDifferenceBetweenTwoPairs {

    public static int maxProductDifference(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        int a, b, c, d, result = 0;

        if (n >= 4) {
            a = nums[0];
            b = nums[1];
            c = nums[n - 2];
            d = nums[n - 1];

            result = (int) Math.abs((a * b) - (c * d));

        }

        return result;
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

        int result = maxProductDifference(arr);

        System.out.println(result);
        sc.close();
    }
}
