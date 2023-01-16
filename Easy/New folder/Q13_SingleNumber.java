import java.util.*; // Q - 136

public class Q13_SingleNumber {

    public static int singleNumber(int[] nums) {

        List<Integer> singleNum = new ArrayList<>();

        for (int i : nums) {
            if (!singleNum.contains(i)) {
                singleNum.add(i);
            } else {
                // singleNum.remove(new Integer(i));
            }
        }

        return singleNum.get(0);
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

        int result = singleNumber(arr);

        System.out.println(result);

        sc.close();
    }

}
