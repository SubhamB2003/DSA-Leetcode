// import java.util.*; // Q - 1304

public class Q20_Find_N_UniqueIntegersSumuptoZero {

    public int[] sumZero(int n) {

        int ans[] = new int[n];
        int c = 0, count = 0;

        for (int i = 1; i < n; i++) {
            ans[count] = i;
            c += ans[count];
            count++;
        }

        ans[n - 1] = -c;

        return ans;

    }

    // xxxxxxxxxxxxxx
    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the length : ");
    // int n = sc.nextInt();

    // Q20_Find_N_UniqueIntegersSumuptoZero ob = new
    // Q20_Find_N_UniqueIntegersSumuptoZero();
    // System.out.println(ob.sumZero(n));

    // sc.close();
    // }

}
