class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // HashMap<Integer, Integer> map = new HashMap<>();
        // HashSet<Integer> set = new HashSet<>();
        // int ans[] = new int[arr1.length];

        // for(int i = 0; i < arr1.length; i++) {
        // map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        // }

        // int j = 0;
        // for(int i = 0; i < arr2.length; i++) {
        // set.add(arr2[i]);
        // while(map.get(arr2[i]) > 0) {
        // ans[j++] = arr2[i];
        // map.put(arr2[i], map.get(arr2[i]) - 1);
        // }
        // }

        // Arrays.sort(arr1);
        // for(int i = 0; i < arr1.length; i++) {
        // if(!set.contains(arr1[i])) {
        // ans[j++] = arr1[i];
        // }
        // }

        // return ans;

        int[] cnt = new int[1001];
        for (int n : arr1)
            cnt[n]++;
        int i = 0;
        for (int n : arr2) {
            while (cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for (int n = 0; n < cnt.length; n++) {
            while (cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;

    }
}