import java.util.Scanner; // Q - 26

public class Q7_RemoveDuplicateElement {

    public int removeDuplicates(int[] nums) {

        int j = 1, n = nums.length;

        if (n == 0) {
            return 0;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    nums[j++] = nums[i + 1];
                }
            }
        }

        return j;
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

        Q7_RemoveDuplicateElement ob = new Q7_RemoveDuplicateElement();
        int result = ob.removeDuplicates(arr);

        System.out.println(result);
        sc.close();
    }
}