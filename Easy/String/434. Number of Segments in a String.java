class Solution {
    public int countSegments(String s) {

        String trimed = s.trim();

        if (trimed.equals(""))
            return 0;
        return trimed.split("\\s+").length;
    }
}