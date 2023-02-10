class Solution {
    public int countOperations(int num1, int num2) {

        int ans = 0;
        if (num1 == num2 && num1 != 0)
            return 1;
        if (num1 == 0 && num2 == 0)
            return 0;

        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
                ;
            }
            ans++;
        }

        return ans;
    }
}