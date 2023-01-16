import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // The overall run time complexity should be O(log (m+n))

        ArrayList<Integer> al = new ArrayList<>();

        int n = nums1.length, m = nums2.length;
        for (int i = 0; i < n; i++) {
            al.add(nums1[i]);
        }

        for (int i = 0; i < m; i++) {
            al.add(nums2[i]);
        }

        Collections.sort(al);

        double ans = 0;
        if ((n + m) % 2 == 0) {
            ans = ((double) (al.get(((n + m) / 2) - 1) + al.get((n + m) / 2)) / 2);
        } else {
            ans = al.get((n + m) / 2);
        }

        return ans;
    }
}