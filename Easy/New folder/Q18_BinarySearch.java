import java.util.*; // Q - 704

public class Q18_BinarySearch {

    public int search(int[] nums, int target) {

        int pivot = 0, l = 0, r = nums.length - 1;
        while (l <= r) {
            pivot = (l + r) / 2;

            if (nums[pivot] == target) {
                return pivot;
            }
            if (target < nums[pivot]) {
                r = pivot - 1;
            } else {
                l = pivot + 1;
            }
        }
        return -1;

    }

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target : ");
        int target = sc.nextInt();

        Q18_BinarySearch ob = new Q18_BinarySearch();
        int result = ob.search(arr, target);

        System.out.println(result);
        sc.close();
    }
}
