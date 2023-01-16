import java.util.*; // Q - 27

public class Q8_RemoveElement {

    public int removeElement(int[] nums, int val) {

        int j = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
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

        System.out.println("Enter the value you remove : ");
        int val = sc.nextInt();

        Q8_RemoveElement ob = new Q8_RemoveElement();
        int result = ob.removeElement(arr, val);

        System.out.println(result);
        
        sc.close();
    }
}
