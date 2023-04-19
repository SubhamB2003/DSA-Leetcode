class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();

        int opBraces = 0, closeBraces = 0, sIndex = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                opBraces++;
            } else {
                closeBraces++;
            }

            if (opBraces == closeBraces) {
                sb.append(s.substring(sIndex, i));
                sIndex = i + 2;
            }
        }

        return sb.toString();
    }
}