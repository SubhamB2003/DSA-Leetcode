import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1)
            set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2)
            set2.add(n);

        set1.retainAll(set2);

        int[] ans = new int[set1.size()];
        int i = 0;

        for (int s : set1)
            ans[i++] = s;

        return ans;

        // ArrayList<Integer> list = new ArrayList<>();

        // int n = nums1.length, m = nums2.length, k = 0;

        // for(int i = 0; i < n; i++) {
        // for(int j = 0; j < m; j++) {
        // if(nums1[i] == nums2[j]) {
        // if(!list.contains(nums1[i])) {
        // list.add(nums1[i]);
        // }
        // }
        // }
        // }
        // // System.out.print(list);

        // int ans[] = new int[list.size()];

        // for(int i = 0; i < list.size(); i++) {
        // ans[k++] = list.get(i);
        // }

        // return ans;
    }
}