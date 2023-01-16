class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch))
                sb.append(ch);
        }

        s = String.valueOf(sb);
        String rev = String.valueOf(sb.reverse());

        if (s.equals(rev))
            return true;
        else
            return false;
    }
}