import java.util.Scanner; //Q - 189

public class Q2_RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length : ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter how many time you rotate : ");
        int k = sc.nextInt();

        Solution ob = new Solution();
        ob.rotate(nums, k);

        sc.close();
    }
}

class Solution {
    public void rotate(int[] nums, int k) {

        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int l, int r) {

        while (l < r) {
            nums[l] = nums[l] ^ nums[r];
            nums[r] = nums[l] ^ nums[r];
            nums[l] = nums[l] ^ nums[r];
            l++;
            r--;
        }
    }
}