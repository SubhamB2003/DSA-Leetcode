import java.util.Scanner;

class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 4;
        int arr[] = { 8, 3, 1, 2 };

        int max = 0;
        while (n-- > 0) {
            int temp = arr[0], sum = 0;
            // for (int i = 1; i < n; i++) {
            // arr[i - 1] = arr[i];
            // }
            // arr[n - 1] = temp;

            for (int i = 0; i < n; i++) {
                sum = sum + (arr[i] + i);
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);

        sc.close();

    }
}

// class Solution {
// public void rotate(int[] nums, int k) {

// 1st Apporach
// int n = nums.length;
// k %= n;

// reverse(0, n-1, nums);
// reverse(0, k-1, nums);
// reverse(k, n-1, nums);
// }

// public void reverse(int l, int r, int nums[]) {
// while(l < r) {
// nums[l] = nums[l] ^ nums[r];
// nums[r] = nums[l] ^ nums[r];
// nums[l] = nums[l] ^ nums[r];
// l++;
// r--;
// }

// 2nd Apporach
// int n = nums.length, j = 0;
// k %= n;
// ArrayList<Integer> list = new ArrayList<>();

// for(int i = n - k; i < n; i++) {
// list.add(nums[i]);
// }

// for(int i = 0; i < n - k; i++) {
// list.add(nums[i]);
// }

// for(int i = 0; i < n; i++) {
// nums[i] = list.get(j++);
// }

// }
// }
