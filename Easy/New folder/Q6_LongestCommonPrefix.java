import java.util.Scanner; //Q - 14

public class Q6_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        String arr[] = new String[n];
        System.out.println("Enter the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Q6_LongestCommonPrefix ob = new Q6_LongestCommonPrefix();
        String result = ob.longestCommonPrefix(arr);

        System.out.println("Longest Common Prefix : " + result);

        sc.close();
    }
}