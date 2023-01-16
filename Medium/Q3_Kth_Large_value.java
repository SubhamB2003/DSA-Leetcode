import java.util.*; //Q - 215

public class Q3_Kth_Large_value {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length : ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the k-th value : ");
        int k = sc.nextInt();

        Solution ob = new Solution();
        ob.findKthLargest(nums, k);

        sc.close();
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {

        int n = nums.length;

        Arrays.sort(nums);
        int result = nums[n - k];

        return result;
    }
}