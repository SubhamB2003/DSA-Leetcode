import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int KeyIndx = 0, ans = 0;
        if (ruleKey.equals("type")) {
            KeyIndx = 0;
        } else if (ruleKey.equals("color")) {
            KeyIndx = 1;
        } else if (ruleKey.equals("name")) {
            KeyIndx = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(KeyIndx).equals(ruleValue)) {
                ans++;
            }
        }

        return ans;
    }
}