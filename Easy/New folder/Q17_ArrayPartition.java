import java.util.*; // Q - 561

public class Q17_ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        int sum = 0, n = nums.length;

        Arrays.sort(nums);
        for (int i = 0; i < n; i = i + 2) {
            sum += nums[i];
        }

        return sum;
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

        int result = arrayPairSum(arr);

        System.out.println(result);
        sc.close();
    }

}
