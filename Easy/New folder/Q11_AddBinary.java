import java.util.*; // Q - 67

public class Q11_AddBinary {

    public String addBinary(String a, String b) {

        StringBuilder s = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int temp = 0;

        while (i >= 0 || j >= 0) {
            int sum = temp;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            s.append(sum % 2);
            temp = sum / 2;
            i--;
            j--;
        }

        if (temp != 0) {
            s.append(temp);
        }

        return s.reverse().toString();
    }

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st Binary String : ");
        String a = sc.nextLine();

        System.out.println("Enter the 2nd Binary String : ");
        String b = sc.nextLine();

        String ans = addBinary(a, b);
        System.out.println("Sum of two binary String : " + ans);

        sc.close();
    }
}
