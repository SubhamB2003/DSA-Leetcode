import java.util.*; // Q - 2129

public class Q24_CapitalizetheTitle {

    public static String capitalizeTitle(String title) {

        title = title.toLowerCase();
        String words[] = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 3) {
                sb.append(words[i] + " ");
            } else {
                char ch = words[i].charAt(0);
                ch = Character.toUpperCase(ch);
                String new_word = ch + words[i].substring(1);
                sb.append(new_word + " ");
            }
        }

        String result = sb.toString();
        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String title = sc.nextLine();

        String result = capitalizeTitle(title);

        System.out.println(result);
        sc.close();
    }
}
