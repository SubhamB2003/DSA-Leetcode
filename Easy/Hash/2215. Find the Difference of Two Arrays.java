import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int e : nums1) {
            set1.add(e);
        }
        for (int e : nums2) {
            set2.add(e);
        }

        for (int e : set1) {
            if (!set2.contains(e)) {
                list1.add(e);
            }
        }
        for (int e : set2) {
            if (!set1.contains(e)) {
                list2.add(e);
            }
        }

        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}