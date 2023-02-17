class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder();

        int i = 0, s1 = word1.length(), s2 = word2.length();
        while(i < s1 && i < s2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }

        while(i < s1){
            sb.append(word1.charAt(i));
            i++;
        }
        while(i < s2){
            sb.append(word2.charAt(i));
            i++;
        }
        
        return sb.toString();
    }
}