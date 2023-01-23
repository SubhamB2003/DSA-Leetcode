class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length()) return false;

        int []ch = new int[26];

        for(char c : ransomNote.toCharArray()) {
            int indx = magazine.indexOf(c, ch[c - 'a']);

            if(indx == -1) return false;
            ch[c - 'a'] = indx + 1;

        }

        // HashMap<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i < magazine.length(); i++) {
        //     map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        // }

        // for(int i = 0; i < ransomNote.length(); i++) {
        //     if(!map.containsKey(ransomNote.charAt(i))) {
        //         return false;
        //     } else {
        //         map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
        //     }
        // }

        // for(Map.Entry<Character, Integer> e : map.entrySet()) {
        //     if(e.getValue() < 0) {
        //         return false;
        //     }
        // }

        return true;

    }
}