import java.util.HashMap;

class Solution {
    public String sortSentence(String s) {

        // String arr[] = s.split(" ");
        // String newArr[] = new String[arr.length];
        StringBuilder ans = new StringBuilder();
        // for(int i = 0; i < arr.length; i++) {
        // char no = arr[i].charAt(arr[i].length() - 1);
        // newArr[(no - '0') - 1] = arr[i].substring(0, arr[i].length() - 1);
        // }

        // for(int i = 0; i < arr.length; i++) {
        // if(i == arr.length - 1) {
        // ans.append(newArr[i]);
        // } else {
        // ans.append(newArr[i] + " ");
        // }
        // }

        int begin = 0;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' > 0 && s.charAt(i) - '0' <= 9) {
                map.put(s.charAt(i) - '0', s.substring(begin, i));
                begin = i + 2;
            }
        }
        for (int i = 0; i < map.size(); i++) {
            if (i == map.size() - 1) {
                ans.append(map.get(i + 1));
            } else {
                ans.append(map.get(i + 1) + " ");
            }
        }
        return ans.toString();
    }
}