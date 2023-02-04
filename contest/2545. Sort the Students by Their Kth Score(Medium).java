import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {

        int row = score.length, col = score[0].length, c = 0;
        int ans[][] = new int[row][col];

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            list.add(score[i][k]);
            map.put(score[i][k], i);
        }
        Collections.sort(list, Collections.reverseOrder());

        int i;
        while (row-- > 0) {
            i = map.get(list.get(c));
            for (int j = 0; j < col; j++) {
                ans[c][j] = score[i][j];
            }
            c++;
        }

        return ans;

    }
}