import java.util.*;  //Q - 1

public class Q1_TwoSum {

    // Bruth Forces

    // public int[] twoSum(int nums[], int target) {
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // int complement = target - nums[i];

    // if (nums[j] == complement) {
    // // return new int[]{i, j};
    // System.out.println(i + " " + j);
    // }
    // }
    // }
    // return null;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target value : ");
        int target = sc.nextInt();

        Q1_TwoSum ob = new Q1_TwoSum();
        ob.twoSum(nums, target);

        sc.close();
    }

    // Optimize

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (sum.containsKey(target - nums[i])) {
                // return new int[] { sum.get(target - nums[i]), i };

                System.out.println(sum.get(target - nums[i]) + " " + i);
            }
            sum.put(nums[i], i);
        }

        throw new IllegalArgumentException("no match found");
    }

}