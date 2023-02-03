import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maximumWealth(int[][] accounts) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < accounts.length; i++) {
            int ans = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                ans += accounts[i][j];
            }
            list.add(ans);
        }
        return Collections.max(list);

        // int sum = 0, ans = 0;
        // int customers = accounts.length;
        // int banks = accounts[0].length;

        // for(int i = 0; i < customers; i++){
        // for(int j = 0; j < banks; j++){
        // sum += accounts[i][j];
        // if(sum > ans){
        // ans = sum;
        // }
        // }
        // sum = 0;
        // }

        // return ans;
    }
}