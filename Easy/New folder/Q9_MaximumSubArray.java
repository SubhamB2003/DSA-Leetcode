import java.util.*; // Q - 53

public class Q9_MaximumSubArray {

    public int maxSubArray(int[] nums) {

        int curSum = 0, max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            max = Math.max(curSum, max);

            if (curSum < 0) {
                curSum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st arr len : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the 1st arr : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Q9_MaximumSubArray ob = new Q9_MaximumSubArray();
        int result = ob.maxSubArray(arr);

        System.out.println("Contiguous SubArray : " + result);
        sc.close();
    }
}
