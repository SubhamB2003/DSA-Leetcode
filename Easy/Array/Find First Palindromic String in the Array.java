class Solution {
    public String firstPalindrome(String[] words) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (words[i].equals(sb.reverse().toString())) {
                return words[i];
            }
            sb.setLength(0);
        }

        return "";
    }
}