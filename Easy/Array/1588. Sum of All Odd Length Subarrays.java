class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0, n = arr.length;

        for (int i = 0; i < n; i++) {
            int l = i + 1, r = n - i;
            int odd = ((l * r) + 1) / 2;
            sum += odd * arr[i];
        }

        return sum;

    }
}