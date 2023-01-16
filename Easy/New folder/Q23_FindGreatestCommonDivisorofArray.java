import java.util.*; // Q - 1979

public class Q23_FindGreatestCommonDivisorofArray {

    public int gcd(int a, int b) {
        if (b > a) {
            return gcd(b, a);
        } else if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int small = nums[0];
        int large = nums[nums.length - 1];

        return gcd(large, small);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Q23_FindGreatestCommonDivisorofArray ob = new Q23_FindGreatestCommonDivisorofArray();
        int result = ob.findGCD(arr);

        System.out.println(result);
        sc.close();
    }

}
