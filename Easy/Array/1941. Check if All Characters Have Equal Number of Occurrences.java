class Solution {
    public boolean areOccurrencesEqual(String s) {

        int cArr[] = new int[26];
        int val = 0;

        for(char e : s.toCharArray()) {
            cArr[e - 'a']++;
        }
        
        for(int i : cArr) {
            if(i == 0) {
                continue;
            } else if(i != 0 && val == 0) {
                val = i;
            } 

            if(val != i) return false;
        }

        return true;
        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++) {
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // int ans = map.get(s.charAt(0));
        // for(int i = 1; i < s.length(); i++) {
        //     if(map.get(s.charAt(i)) != ans) {
        //         return false;
        //     }
        // }

        // return true;
    }
}