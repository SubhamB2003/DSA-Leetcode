import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        int n = num.length, temp = k;

        while (n-- > 0 || temp > 0) {
            if (n >= 0) {
                temp += num[n];
            }
            list.add(temp % 10);
            temp /= 10;
        }

        Collections.reverse(list);
        return list;
    }
}