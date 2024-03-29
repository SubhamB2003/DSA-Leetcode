import java.util.HashMap;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int ans[] = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                for (int j = map.get(nums1[i]); j < nums2.length; j++) {
                    if (nums1[i] < nums2[j]) {
                        ans[i] = nums2[j];
                        break;
                    }
                }
                if (ans[i] == 0) {
                    ans[i] = -1;
                }
            }
        }

        return ans;

        // int arr[] = new int[nums1.length];

        // int c = 0;
        // for(int i = 0; i < nums1.length; i++) {
        // for(int j = 0; j < nums2.length; j++) {
        // if(nums1[i] == nums2[j]) {
        // for(int k = j; k < nums2.length; k++) {
        // if(nums2[k] > nums1[i]) {
        // arr[c++] = nums2[k];
        // break;
        // }
        // else if(k == nums2.length - 1) {
        // arr[c++] = -1;
        // }
        // }
        // }
        // }
        // }

        // return arr;

    }
}