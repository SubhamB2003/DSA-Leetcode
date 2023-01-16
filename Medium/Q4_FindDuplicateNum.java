import java.util.*;// Q - 287

public class Q4_FindDuplicateNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution ob = new Solution();
        int ans = ob.findDuplicate(arr);

        System.out.println("The duplicate Element : " + ans);

        sc.close();
    }
}

class Solution {

    public int findDuplicate(int[] nums) {

        int temp = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                temp = nums[i];
            }
        }
        return temp;

    }
}
