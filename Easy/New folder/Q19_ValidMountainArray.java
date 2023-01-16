import java.util.*; // Q - 941

public class Q19_ValidMountainArray {

    public boolean validMountainArray(int[] arr) {

        int i = 0, n = arr.length;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
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

        // Q19_ValidMountainArrayh ob = new Q19_ValidMountainArray();
        boolean result = validMountainArray(arr);

        System.out.println(result);
        sc.close();
    }
}
