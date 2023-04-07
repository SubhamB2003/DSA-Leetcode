class Solution {
    public static int addMinChar(String str) {
        // code here

        int i = 0, j = str.length() - 1, c = 0;
        int lastCheck = j;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                i = 0;
                c++;
                j = --lastCheck;
            }
        }

        return c;
    }
}