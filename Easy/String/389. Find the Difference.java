class Solution {
    public char findTheDifference(String s, String t) {

        // HashMap<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i < s.length(); i++) {
        // map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }
        // char ans = ' ';
        // for(int i = 0; i < t.length(); i++) {
        // map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        // }
        // for(Map.Entry<Character, Integer> e : map.entrySet()) {
        // if(e.getValue() < 0) {
        // ans = e.getKey();
        // }
        // }
        // return ans;

        byte[] a = s.getBytes();
        byte[] b = t.getBytes();
        byte ans = 0;

        int n = a.length;
        for (int i = 0; i < n; ++i) {
            ans ^= a[i] ^ b[i];
        }
        ans ^= b[n];

        return (char) ans;

    }
}