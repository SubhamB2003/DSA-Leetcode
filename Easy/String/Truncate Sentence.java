class Solution {
    public String truncateSentence(String s, int k) {

        String ans[] = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                sb.append(ans[i]);
            } else {
                sb.append(ans[i] + " ");
            }
        }

        return sb.toString();

    }
}