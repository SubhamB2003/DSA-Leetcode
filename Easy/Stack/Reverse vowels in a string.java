import java.util.Stack;

class Solution {
    public static String reverseVowels(String s) {
        // Write your code here.

        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                st.push(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                ans.append(st.pop());
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}