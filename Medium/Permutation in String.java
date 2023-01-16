import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();
        char arr[] = s1.toCharArray();
        Arrays.sort(arr);

        int len = s1.length(), j = 0;
        for (int i = len; i <= s2.length(); i++) {
            list.add(s2.substring(j++, i));
        }

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            char arr2[] = temp.toCharArray();
            Arrays.sort(arr2);

            if (Arrays.equals(arr, arr2)) {
                return true;
            }
        }

        // System.out.print(list);

        return false;
    }
}