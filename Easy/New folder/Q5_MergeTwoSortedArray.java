import java.util.Scanner; //Q - 88

public class Q5_MergeTwoSortedArray {

    // Two Pointer Apporoach

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1, y = n - 1, i = m + n - 1;

        int nums3[] = new int[n + m];

        while (y >= 0) {
            if (x >= 0 && nums1[x] > nums2[y]) {
                nums3[i--] = nums1[x--];
            } else {
                nums3[i--] = nums2[y--];
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st arr len : ");
        int n = sc.nextInt();

        System.out.println("Enter the 2nd arr len : ");
        int m = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        System.out.println("Enter the 1st arr : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the 2nd arr : ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        merge(arr1, m, arr2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
