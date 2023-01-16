import java.util.Stack; //Q - 20

public class Q4_Vaild_Parentheses {
    public static boolean isVaild(String s) {

        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if (st.isEmpty()) {
                    return false;
                }
                char ch = st.pop();
                if ((it == ')' && ch == '(') || (it == ']' && ch == '[') || (it == '}' && ch == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

}
