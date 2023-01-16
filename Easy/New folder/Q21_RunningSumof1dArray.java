import java.util.*; // Q - 1480

public class Q21_RunningSumof1dArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Q21_RunningSumof1dArray ob = new Q21_RunningSumof1dArray();
        ob.runningSum(arr);

        System.out.println("Print the array : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        sc.close();
    }

    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int k = 1;

        for (int i = 0; i < n - 1; i++) {
            nums[k++] = nums[i] + nums[i + 1];
        }
        return nums;
    }
}