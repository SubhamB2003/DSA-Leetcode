class Solution {
    public boolean isHappy(int n) {

        // Set<Integer> set = new HashSet<>();

        // while(n != 1 && !set.contains(n)) {
        // set.add(n);
        // n = getNext(n);
        // }

        // return n == 1;
        // }

        // public int getNext(int n) {

        // int sum = 0;

        // while(n != 0) {
        // int temp = n % 10;
        // sum += temp * temp;
        // n /= 10;
        // }

        // return sum;

        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }

        if (sum == 1)
            return true;
        else if (sum == 4)
            return false;

        return isHappy(sum);

    }

}