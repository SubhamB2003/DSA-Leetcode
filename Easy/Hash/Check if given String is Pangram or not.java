class Solution {
    public boolean checkIfPangram(String sentence) {

        if (sentence.length() < 26)
            return false;

        // 1st logic

        // HashSet<Character> set = new HashSet<>();
        // for(int i = 0; i < sentence.length(); i++) {
        // set.add(sentence.charAt(i));
        // }
        // if(set.size() != 26) return false;
        // return true;

        // 2nd logic
        char ch = 97;
        for (int i = 0; i < 26; i++) {
            if (sentence.indexOf(ch) == -1)
                return false;
            ch++;
        }

        return true;
    }
}